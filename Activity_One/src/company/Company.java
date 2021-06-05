package company;
public class Company
{
    private String name;
    private String employees;
    private String teamlead;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public String getTeamlead()
	{
		return teamlead;
		}
	public void setTeamlead(String teamlead)
	{
		if(teamlead.equals("Thomas"))
		{
			this.teamlead="Thomas";
		}
		else
		{
			this.teamlead="Invalid Input";

		}
	}
}
