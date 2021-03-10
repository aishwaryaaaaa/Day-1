
public class StringDemo {
	public static void main(String[] args) {
		//usingStringPool();
		//withoutStringPool();
		withStringBuilder();
	
		
	}
	private static void withStringBuilder() {
		StringBuilder s1=new StringBuilder("IBM");//heap
		StringBuilder s2=new StringBuilder("IBM");
		System.out.println(s1==s2);
	}
private static void withoutStringPool() {
	String s1=new String("IBM");
	String s2=new String("IBM");
	System.out.println(s1==s2);
}
private static void usingStringPool() {
	String s1="IBM";
	String s2="IBM";
	System.out.println(s1==s2);
}
}
