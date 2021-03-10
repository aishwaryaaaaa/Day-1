package dataConversion;

public class Student extends Human {
	public Student(String name)
	{ name=this.name;
	}
	private String name;
	
	private GENDER gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public GENDER getGender() {
		return gender;
	}
	public void setGender(GENDER gender) {
		this.gender = gender;
	}
	
	void eat() {
		System.out.println("Student eats");
	}
	}


