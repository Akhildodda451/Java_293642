package hotel;

public class HotelRoom {

	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	
public int calculaeTarrif()	{
	return numberOfSqFeet*getRatePerSqFeet();
	
}

public int getRatePerSqFeet() {
	// TODO Auto-generated method stub
	return 0;
}


}
