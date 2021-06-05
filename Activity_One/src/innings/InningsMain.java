package innings;
import java.util.Scanner;

public class InningsMain extends Innings
{

	public static void main(String[] args)
      {
            String teamname,inningsname;
            int runs;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Team Name:");
            teamname=sc.nextLine();
            System.out.println("Enter Session:");
            inningsname=sc.nextLine();
            System.out.println("Enter Runs : ");
            runs=sc.nextInt();
            if(runs<0)
            {
                        System.out.println("Invalid  Input");
                        System.exit(0);
            }
            Innings inn=new Innings();
            inn.setTeamname(teamname);
            inn.setInningsname(inningsname);
            inn.setRuns(runs);
            inn.DisplayInningsDetails();
      }
}