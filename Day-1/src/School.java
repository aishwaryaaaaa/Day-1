

public class School {
     public static void main(String[] args) {
    	 
    	 for(int i=0;i<10;i++)
    	 {Teacher teacher = new Teacher("Shyam"+i);
    	 }		
     //int i=0;
     	 //while(int i<10)
    	// { Teacher teacher = new Teacher("Shyam"+i);
    	 //i++;
    	 //}
    	 //do {
    		// Teacher teacher = new Teacher("Shyam"+i);
    		 //i++;
    	// }while( int i<10)
    	 }
    		 
     void studentDiscussion() {
		System.out.println("Hello");
		Student student=new Student("Ram");
		student.setAge((byte)10);
	//	student.setName("    ");//avoid
//		student.name="Ram";
		System.out.println("Name="+student.getName());
		System.out.println(student.getAge());
		student.study();// Ram is studing
	}
}
