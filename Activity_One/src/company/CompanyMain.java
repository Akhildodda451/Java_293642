package company;
import java.util.Scanner;
public class CompanyMain extends Company
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Company c= new Company();
		System.out.println("Enter compnay name:");
		String text=sc.nextLine();
		c.setName(text);
		System.out.println("Enter the employees:");
		String text1=sc.next();
		String[] str=text1.split(",");
		c.setEmployees(text1);
		System.out.println("Enter the teamlead:");
		String text2=sc.next();
		c.setTeamlead(text2);
		if(c.getTeamlead().equals("Invalid Input"))
		{
			System.out.println(c.getTeamlead());

		}
		else
		{
			System.out.println("Name:"+c.getName());
			System.out.println("Employees:"+c.getEmployees());
			System.out.println("Lead:"+c.getTeamlead());
		}	
	}
}