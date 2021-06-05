package hotel;

public class DeluxeRoom extends HotelRoom{

	private int ratePerSqFeet=10;
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
	}

	public  int getRatePerSqFeet()
	{
		
		if(hasWifi==true)
		{
			return ratePerSqFeet+2;
		}
		else
		{
			return ratePerSqFeet;
		}
	}
	
	
	
}
