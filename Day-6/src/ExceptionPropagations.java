
public class ExceptionPropagations {
public static void main(String args[])
{
	new A().m1();
}
}
class A{
	void m1() {
		try {
	m2();	}catch(RuntimeException runtimeException)
		{
		}
		
		System.out.println("m1");
//		m2();
	}
	void m2() {
		System.out.println("A");
		throw new RuntimeException();
//		System.out.println("m2");
	}
}