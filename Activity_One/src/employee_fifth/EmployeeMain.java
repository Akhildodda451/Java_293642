package employee_fifth;

import java.util.Scanner;
public class EmployeeMain extends Employee
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e= new Employee();
		System.out.println("Enter the name");
		e.setName(sc.nextLine());
		
		System.out.println("Enter Address");
		e.setAddress(sc.nextLine());
		
		System.out.println("Enter Mobile");
		e.setMobile(sc.nextLine());
		
		System.out.println("Employee Details");
		System.out.println("Name: "+e.getName());
		System.out.println("Address: "+e.getAddress());
		System.out.println("Mobile: "+e.getMobile());

		int n=1;
		while(n==1)
		{
		    System.out.println("Menu\n");
		    System.out.println("1. Update Employee name");
		    System.out.println("2. Update Employee Address");
		    System.out.println("3. Update Employee Mobile");
		    System.out.println("4. All information correct/Exit");

		    int num=sc.nextInt();
		    switch(num){
		        case 1:
		            System.out.println("Current Name is:" +e.getName());
		            System.out.println("Enter the Name: ");
		    		Scanner a = new Scanner(System.in);

		            e.setName(a.nextLine());
		            break;
		        case 2 :
		        	System.out.println("Current Address is:" +e.getAddress());
		            System.out.println("Enter the Address: ");
		    		Scanner b = new Scanner(System.in);

		            e.setAddress(b.nextLine());
		            break;
		        case 3 :
		        	System.out.println("Current mobile is:" +e.getMobile());
		            System.out.println("Enter the Mobile: ");
		    		Scanner c = new Scanner(System.in);

		            e.setMobile(c.nextLine());
		            break;
		        case 4:
		            System.out.println("The details are:\n");
		            System.out.println("Name: "+e.getName());
		            System.out.println("Address: "+e.getAddress());
		            System.out.println("Mobile: "+e.getMobile());
		         
		            System.exit(0);
		    }
		}
	}
}













