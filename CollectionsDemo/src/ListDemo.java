import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListDemo {
public static void main(String[] args) {
	
	bookList();
}
private static void bookList() {
	List<Book> books=new ArrayList<Book>();
	books.add(new Book("learn Java"));
	books.add(new Book("teach Javascript"));
//	System.out.println(books);
	
	Iterator<Book> it= books.iterator();
	while(it.hasNext())
	{ Book book=it.next();
	if(book.getTitle().contains("learn")) {
		
	System.out.println(book);
	}
}
}

private static void demo1() {
	List <Integer> list=new ArrayList<Integer>();//generics
	list.add(1);
	list.add(3);
	//list.add("Ram");//not allowed
	System.out.println("Before"+list);
	//list.remove(1);
	System.out.println(list.contains(3));
	System.out.println("after"+list);
	for(Iterator iterator=list.iterator();iterator.hasNext();)
	{ Integer integer=(Integer) iterator.next();
		System.out.println(integer);
	}
}
}

