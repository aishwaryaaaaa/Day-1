import java.util.Set;
import java.util.HashSet;
import java.awt.print.Book;
public class SetDemo {
public static void main(String[] args) {
	createBookSet();
}
private static void createBookSet() {
	createBookSet();
}
private static void createBookSet() {
	Set<Book> books=new HashSet<Book>();
	for(int i=0;i<4;i++)
	{
		Book book=new Book("Title "+i);
		book.setPrice(100*i);
		book.setPublisherYear(i+2000);
		books.add(book);
		System.out.println(books);
	}
}
}
