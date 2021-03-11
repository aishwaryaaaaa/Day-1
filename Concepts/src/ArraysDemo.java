
public class ArraysDemo {
	public static void main(String[] args) {
	//	int[] scores=new int[10];//objects
		//for(int i=0;i<scores.length;i++) {
			//System.out.println(scores[i]);
		//}
	//	System.out.println(scores);
		//int[] numbers= {1,2,3,4};
//		for(int i=0;i<numbers.length;i++) {
	//		System.out.println(numbers[i]);
		//}
	//	boolean[] booleans= {true,false};
	//for(boolean value:booleans)
		//{
	//	System.out.println(value);
		//}
		String[]names=new String[10];
		for(String name:names)
		{ name=new String("Ram");
		name="Ram";
		System.out.println(name);
		}
		Student[] students=new Student[10];
		for(int i=0;i<students.length;i++) {
			Student student = new Student("Ram"+i);
			students[i]=student;
			break;
		}
		System.out.println("length="+students.length);
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i]);
		}
	}
}
class Student{
	private String name;
	public Student(String name) {
		super();
		this.name=name;
	}
}