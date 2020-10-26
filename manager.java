package akashsharma;

public class manager {

	private float salary;
	private String name;
	// setters
	public void setSalary(float salary1) {
	salary=salary1;
	}	
	public void setName(String name1) {
	name=name1;
	}
	public void assign_Work(String name1) {
	System.out.println(name1+" - Task is being given to you");
	}
	// getters
	public float getSalary() {
	return salary;
	}
	public String getName() {
	return name;
	}
	}