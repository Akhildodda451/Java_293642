package innings;

class Innings
{
	private String teamname;
    private String inningsname;
    private int runs;
   
    public String getTeamname() 
    {
		return teamname;
    }

	public void setTeamname(String teamname) 
	{
		this.teamname = teamname;
	}

	public String getInningsname() 
	{
		return inningsname;
	}

	public void setInningsname(String inningsname) 
	{
		this.inningsname = inningsname;
	}

	public int getRuns() 
	{
		return runs;
	}

	public void setRuns(int runs) 
	{
		this.runs = runs;
	}

	public void DisplayInningsDetails()
    {
          String o=getInningsname();
          if(o.equals("Second"))
         {
                     System.out.println("Name:"+getTeamname());
                     System.out.println("Scored:"+getRuns());
                     System.out.println("Match Ended");
         }
         else if(o.equals("First"))
         {
                     System.out.println("Name:"+getTeamname());
                     System.out.println("Scored:"+getRuns());
                     System.out.println("Need"+(getRuns()+1)+" to win");
         }
         else
         {
                    System.out.println("Invalid Input");
         }
    }
}

