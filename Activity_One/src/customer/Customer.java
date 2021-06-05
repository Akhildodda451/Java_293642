package customer;
public class Customer
{
	private String name;
	private String address;
	private String mobile;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "\nName:=" + name + " \nAddress:=" + address + " \nMobile:=" + mobile + "";
	}
	public void displayDetails()
	{
		System.out.println("Name:"+getName());
		System.out.println("Address:"+getAddress());
		System.out.println("Mobile:"+getMobile());
	}
	
	
}
