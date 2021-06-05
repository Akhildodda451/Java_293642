package cricket;

import java.util.Scanner;

public class MatchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.println("Enter the match format\n1.ODI\n2.T20\n3.Test");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
switch(n) {
case 1:
	ODIMatch od=new ODIMatch();
	System.out.println("Enter the Current score");
	int cs=sc.nextInt();
	od.setCurrentscore(cs);
	System.out.println("Enter the Current Over");
	float co=sc.nextInt();
	od.setCurrentover(co);
	System.out.println("Enter the Target Score");
	int ts=sc.nextInt();
	od.setTarget(ts);
	od.display(od.calculateRunRate(), od.calculateBalls());
	break;
case 2:
	T20Match t=new T20Match();
	System.out.println("Enter the Current score");
	int ts1=sc.nextInt();
	t.setCurrentscore(ts1);
	System.out.println("Enter the Current Over");
	float to=sc.nextInt();
	t.setCurrentover(to);
	System.out.println("Enter the Target Score");
	int ta=sc.nextInt();
	t.setTarget(ta);
	t.display(t.calculateRunRate(), t.calculateBalls());
	break;
case 3:
	TestMatch t11=new TestMatch();
	System.out.println("Enter the Current score");
	int a=sc.nextInt();
	t11.setCurrentscore(a);
	System.out.println("Enter the Current Over");
	float b=sc.nextInt();
	t11.setCurrentover(b);
	System.out.println("Enter the Target Score");
	int c=sc.nextInt();
	t11.setTarget(c);
	t11.display(t11.calculateRunRate(), t11.calculateBalls());
	break;
	
	
}
	}

}
