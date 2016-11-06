package inheritance.child;

import inheritance.parent.Employee;
import inheritance.util.MyDate;

public class Secretary extends Employee{
	
	public String manners;
	
	public Secretary(String name, double salary, MyDate birthDate, String manners){
		super(name, salary, birthDate);
		this.manners = manners;
	}
	public String getDetails(){
		return super.getDetails() + "\t" + manners;
	}
}
