package customer;
import java.util.Scanner;
public class CustomerMain extends Customer
{
	private static Scanner sc;

	public static void main(String args[])
	{
		Customer c=new Customer();
		sc = new Scanner(System.in);
		System.out.println("Enter the details");
		String text=sc.next();
		String[] str=text.split(",");
		c.setName(str[0]);
		c.setAddress(str[1]);
		c.setMobile(str[2]);
		System.out.println("Customer Details:");
		c.displayDetails();
	}
}