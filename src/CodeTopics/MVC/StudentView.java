/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeTopics.MVC;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author brendon
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo, Object StudentName2){
      System.out.println("Student: ");
      System.out.println("Name: " + studentName);
      System.out.println("Roll No: " + studentRollNo);
      
      //json addition
//      JSONParser parser = new JSONParser();
//      
//      try{
//          //String s = (String) StudentName2;
//      String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
//      Object obj = parser.parse(s);
//         JSONArray array = (JSONArray)obj;
//			
//         System.out.println("The 2nd element of array");
//         System.out.println(array.get(0));
//         System.out.println();
//    }
//    catch(ParseException pe){
//		
//         System.out.println("position: " + pe.getPosition());
//         System.out.println(pe);
//      }
     System.out.println("JSON format: " + StudentName2);
   }
}
