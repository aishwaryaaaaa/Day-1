
public class Order extends Mainclass {
public Order(int orderid, String name, String address) {
		
		this.orderid = orderid;
		this.name = name;
		this.address = address;
	}
int orderid;
String name;
String address;
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
