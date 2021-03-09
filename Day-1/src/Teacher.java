
public class Teacher extends Human {
	private String name;//immutable
	
	private String subject;//mutable
	private float salary;//mutable
	
	public Teacher(String name) {
		setName(name);
		// TODO Auto-generated constructor stub
	}

	

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	

	void teach() {
		
	}

	void takeAttendance() { //should start with verb

	}
}