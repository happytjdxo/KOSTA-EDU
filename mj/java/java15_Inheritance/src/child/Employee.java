package child;

import parent.Person;

public class Employee extends Person {
   private String dept;

   public Employee(String name, String address, int age, String dept) {
      super(name, address, age);
      this.dept = dept;
   }
   
   @Override
   public String toString() {
      return super.toString() + " " + dept;
   }
  
   public void planEducation(){
	   System.out.println("교육과정을 기획..");
   }
}