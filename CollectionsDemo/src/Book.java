
 public class Book {
public Book(String title, float price, int publishYear) {
		super();
		this.title = title;
		this.price = price;
		this.publishYear = publishYear;
	}

private  String title;
private  float price;
private int publishYear;

public Book(String title) {
	this.title=title;
}

@Override
public String toString() {
	return this.title;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public int getPublishYear() {
	return publishYear;
}

public void setPublishYear(int publishYear) {
	this.publishYear = publishYear;
}
}
