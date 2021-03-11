
public class FinalKeyword {
	public static void main(String[] args) {
		Parent child=new Child();
		child.m1();
	}
}
class Parent{
	public Object m1;
	final String name="Aishwarya";
	 void m1() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	 void m1() {
System.out.println("Child");
	}
}
//class MyString extends String{
	
//}//@override
