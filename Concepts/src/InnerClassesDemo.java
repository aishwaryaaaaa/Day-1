
public class InnerClassesDemo {
	public static void main(String[] args)
	{ //10 objects
		Account[] street=new Account[10];
		
	/*	for(int i=0;i<street.length;i++) {
			Account streets = new Account();
			street[i]=streets;
			
		}
	}*/
	}
}
class Account{
	//private Address address;//single address
	private Address[] addresses;//multiple address
	private int number;
	public Account() {
		this.addresses=new Address[3];
	}
	public Address[] getAddress() {
		return addresses;
	}
	public void setAddress(Address[] addresses) {
		this.addresses = addresses;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	 
	private class Address{
		private String streetName;
}

}