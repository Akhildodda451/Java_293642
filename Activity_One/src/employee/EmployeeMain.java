package employee;
import java.util.Scanner;

public class EmployeeMain extends Employee
{

	public static void main(String args[]){
	
		Employee e=new Employee();
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name");
			String a=sc.nextLine();
			e.setName(a);
			System.out.println("Enter Address");
			String b=sc.nextLine();
			e.setAddress(b);
			System.out.println("Enter Mobile");
			String c=sc.nextLine();
			e.setMobile(c);

		System.out.println("Name:"+e.getName());
		System.out.println("Address:"+e.getAddress());
		System.out.println("Mobile:"+e.getMobile());
	}
	}
