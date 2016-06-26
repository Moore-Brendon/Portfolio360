package CodeTopics.MVC;public class StudentController {
   private Student model;
   private StudentView view;

   public StudentController(Student model, StudentView view){
      this.model = model;
      this.view = view;
   }

   public void setStudentName(String name){
      model.setName(name);		
   }

   public String getStudentName(){
      return model.getName();		
   }

   //json addition
   
   public void setStudentName2(Object obj){
       model.setName2(obj);
   }
   public Object getStudentName2(){
       return model.getName2();
   }
   
   
   
   
   public void setStudentRollNo(String rollNo){
      model.setRollNo(rollNo);		
   }

   public String getStudentRollNo(){
      return model.getRollNo();		
   }

   public void updateView(){				
      view.printStudentDetails(model.getName(), model.getRollNo(), model.getName2());
   }	
}