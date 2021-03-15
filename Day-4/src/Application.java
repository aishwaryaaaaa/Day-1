
 class Book {
private String title;

public String getTitle() {
	return title;
}

public void setTitle(String title)  {
	if(title==null) {
		throw new IllegalArgumentException();
		
	}
	this.title = title;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.title;
	}
}

public class Application{
	public static void main (String[] args) {
		Book book=new Book();
		book.setTitle("learning java");
		System.out.println(book.toString());
		Book book1=new Book();
		book1.setTitle("learning Javascript");
		System.out.println(book1);
	}
}