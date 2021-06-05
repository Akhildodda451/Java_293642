package vehicle;

public class TwoWheeler extends Vehicle{
	private boolean kickStartAvailable;

	public TwoWheeler(String make, String vehicleNum, String fuelType, int fuelCapacity, int cc,boolean kickStartAvailable) {
		super(make, vehicleNum, fuelType, fuelCapacity, cc);
		this.kickStartAvailable=kickStartAvailable;
	}
	
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	public void displayDetailInfo() {
		System.out.println("---Detail Information---");
	if(kickStartAvailable==true)
	{
		System.out.println("Kick Start Available:YES");
	}
	else
		System.out.println("Kick Start Available:NO");

}
}
