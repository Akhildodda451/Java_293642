package vehicle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Four Wheeler\n2.Two Wheeler");
		System.out.println("Enter Vehicle Type:");
		n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("Vehicle Make:");
			String m=sc.next();
			System.out.println("Vehicle Number:");
			String n1=sc.next();
			System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
			int n2=sc.nextInt();
			String t = null;
			switch(n2) {
			case 1:
				 t="Petrol";
			case 2:
				t="Diesel";
			}
			System.out.println("Fuel Capacity:");
			int k=sc.nextInt();
			System.out.println("Engine CC");
			int k1=sc.nextInt();
			System.out.println("Audio System:");
			String a=sc.next();
			System.out.println("Number of Doors:");
			int h=sc.nextInt();
			FourWheeler fw=new FourWheeler(m,n1,t,k,k1,a,h);
			fw.displayMake();
			fw.displayBasicInfo();
			fw.displayDetailInfo();
			break;
			
		case 2:
			System.out.println("Vehicle Make:");
			String m1=sc.next();
			System.out.println("Vehicle Number:");
			String n11=sc.next();
			System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
			int n22=sc.nextInt();
			String t1 = null;
			switch(n22) {
			case 1:
				 t1="Petrol";
				 break;
			case 2:
				t1="Diesel";
				break;
			}
			System.out.println("Fuel Capacity:");
			int k11=sc.nextInt();
			System.out.println("Engine CC");
			int l=sc.nextInt();
			System.out.println("Kick Start Available(yes/no):");
			String a1=sc.next();
			boolean l2 = false;
			switch(a1) {
			case "yes":
				l2=true;
				break;
			case "no":
			l2=false;
			}
			TwoWheeler tw=new TwoWheeler(m1,n11,t1,k11,l,l2);
			tw.displayMake();
			tw.displayBasicInfo();
			tw.displayDetailInfo();
			break;

		}
	}

}
