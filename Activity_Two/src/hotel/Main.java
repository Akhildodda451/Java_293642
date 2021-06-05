package hotel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Hotek Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\nSelect Room Type:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Hotel Name:");
			String s=sc.next();
			System.out.println("RoomSquare Feet Area:");
			int k=sc.nextInt();
			System.out.println("Room has TV(yes/no):");
			String m=sc.next();
			boolean m1=false;
			if(m.equals("yes"))
			{
				m1=true;
			}
			else
			{
				m1=false;
			}
			System.out.println("Room has Wifi(yes/no):");
			String z=sc.next();
			boolean z1=false;
			if(z.equals("yes"))
			{
				z1=true;
			}
			else
			{
				z1=false;
			}
			DeluxeRoom dr=new DeluxeRoom(s,k,m1,z1);
			System.out.println("Room Tariff per day is:"+dr.calculaeTarrif());
			break;
		case 2:
			System.out.println("Hotel Name:");
			String s1=sc.next();
			System.out.println("RoomSquare Feet Area:");
			int k1=sc.nextInt();
			System.out.println("Room has TV(yes/no):");
			String m111=sc.next();
			boolean m11=false;
			if(m111.equals("yes"))
			{
				m11=true;
			}
			else
			{
				m11=false;
			}
			System.out.println("Room has Wifi(yes/no):");
			String z111=sc.next();
			boolean z11=false;
			if(z111.equals("yes"))
			{
				z11=true;
			}
			else
			{
				z11=false;
			}
			DeluxeACRoom da=new DeluxeACRoom(s1,k1,m11,z11);
			System.out.println("Room Tariff per day is:"+da.calculaeTarrif());
			break;
		case 3:
			System.out.println("Hotel Name:");
			String x=sc.next();
			System.out.println("RoomSquare Feet Area:");
			int b=sc.nextInt();
			System.out.println("Room has TV(yes/no):");
			String q=sc.next();
			boolean q1=false;
			if(q.equals("yes"))
			{
				q1=true;
			}
			else
			{
				q1=false;
			}
			System.out.println("Room has Wifi(yes/no):");
			String c=sc.next();
			boolean c1=false;
			if(c.equals("yes"))
			{
				c1=true;
			}
			else
			{
				c1=false;
			}
			SuiteACRoom zx=new SuiteACRoom(x,b,q1,c1);
			System.out.println("Room Tariff per day is:"+zx.calculaeTarrif());
			break;
		}
		
	}

}
