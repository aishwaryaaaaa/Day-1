import java.util.List;
import java.util.ArrayList;
public class Product extends Mainclass {
	int data;

	public Product(int i) {
		i=0;
	}

	public int getdata() {
		return data;
	}

	public void setdata(int data) {
		this.data = data;
	}
	public static void main(String[] args) {
		List<Product>productList =new ArrayList<Product>();
		productList.add(new Product(1));
		productList.add(new Product(2));
		productList.add(new Product(3));
		productList.add(new Product(4));
		productList.add(new Product(5));
		productList.add(new Product(6));
		productList.add(new Product(7));
		productList.add(new Product(8));
		productList.add(new Product(9));
		productList.add(new Product(10));
		
		for( Product product: productList) {
			System.out.println(product.getdata());
		}
	}
	
}
	
	