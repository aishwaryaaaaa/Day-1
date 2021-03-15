public class Basic 
{
     String name;
    /* Basic( String names)
     {
    	 System.out.println("constructor is called");
    	 name=names;
    	// name="java";
     }*/
	public static void main (String args[])
	{
		Basic object=new Basic();
		System.out.println("Language is "+object.name);
	}
}
