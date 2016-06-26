/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeTopics.MVC;
import java.util.Scanner;
import org.json.simple.JSONObject;

/**
 *
 * @author brendon
 */
public class MVCPatternDemo {
   public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      Student model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
      StudentView view = new StudentView();

      StudentController controller = new StudentController(model, view);

      controller.updateView();

      //update model data
      //controller.setStudentName("John");
      
      Scanner user_input = new Scanner( System.in );
      String first_name;
        System.out.print("Enter first name: ");
        first_name = user_input.next( );
        //controller.setStudentName(first_name);
        //controller.updateView();
        
     JSONObject StudentName2 = new JSONObject();

      StudentName2.put("name", first_name);
      StudentName2.put("Roll No", new Integer(10));
      controller.setStudentName(first_name);
      controller.setStudentName2(StudentName2);
      controller.updateView();

      //System.out.print(StudentName2);   
   }



      
   

   
   
   
   private static Student retriveStudentFromDatabase(){
      Student student = new Student();
      student.setName("Robert");
      student.setRollNo("10");
      return student;
   }
}
