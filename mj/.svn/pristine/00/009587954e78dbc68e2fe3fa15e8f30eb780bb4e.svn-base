package inheritance.child;

import inheritance.parent.Employee;
import inheritance.util.MyDate;

public class Engineer extends Employee{

	public String tech;
	
	public Engineer(String name, double salary, MyDate birthDate, String tech){
		super(name, salary, birthDate);
		this.tech = tech;
	}
	public String getDetails(){
		return super.getDetails() + "\t" + tech;
	}
}
