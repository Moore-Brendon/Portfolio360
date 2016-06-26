package CodeTopics;

import java.net.*; 
import java.io.*; 
import java.util.Date;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Server 
{ 
 public static void main(String[] args) throws IOException 
   { 
    ServerSocket serverSocket = null; 

    try { 
         serverSocket = new ServerSocket(9999); 
        } 
    catch (IOException e) 
        { 
         System.err.println("Could not listen on port: 9999."); 
         System.exit(1); 
        } 

    Socket clientSocket = null; 
    System.out.println ("Waiting for connection.....");

    try { 
         clientSocket = serverSocket.accept(); 
        } 
    catch (IOException e) 
        { 
         System.err.println("Accept failed."); 
         System.exit(1); 
        } 

    System.out.println ("Connection successful");
    System.out.println ("Waiting for input.....");

    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), 
                                      true); 
    BufferedReader in = new BufferedReader( 
            new InputStreamReader( clientSocket.getInputStream())); 

    String inputLine; 

    while ((inputLine = in.readLine()) != null) 
        { 
         System.out.println ("Server: " + inputLine); 
         //out.println(inputLine); 
         if (inputLine.equals("Date")) {
             inputLine = new Date().toString();
             out.println(inputLine);}
         else if (inputLine.equals("IP")) {
             inputLine = InetAddress.getLocalHost().toString();
             out.println(inputLine);}
         else if (inputLine.equals("RAM")) {
             
             OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
                 for (Method method : operatingSystemMXBean.getClass().getDeclaredMethods()) {
                    method.setAccessible(true);
                if (method.getName().startsWith("get") 
                && Modifier.isPublic(method.getModifiers())) {
                Object value;
                try {
                 value = method.invoke(operatingSystemMXBean);
                } catch (Exception e) {
                value = e;
               } // try
                inputLine =  "RAM = " + value;
                } // if
            } // for
             
             
             //inputLine = InetAddress.getLocalHost().toString();
             out.println(inputLine);}
         else if (inputLine.equals("Bye.")) {
             out.close(); 
            in.close(); 
            clientSocket.close(); 
            serverSocket.close();
         }
         else {
             out.println(inputLine);
         }
        } 

     
   } 
} 
