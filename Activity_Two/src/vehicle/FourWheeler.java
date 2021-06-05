package vehicle;

public class FourWheeler extends Vehicle{

	private String audioSystem;
	private int numberOfDoors;
	public FourWheeler(String make, String vehicleNum, String fuelType, int fuelCapacity, int cc,String audioSystem,int numberOfDoors) {
		super(make, vehicleNum, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
		this.audioSystem=audioSystem;
		this.numberOfDoors=numberOfDoors;
	}
	
	
	public String getAudioSystem() {
		return audioSystem;
	}


	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}


	public int getNumberOfDoors() {
		return numberOfDoors;
	}


	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}


	public void displayDetailInfo() {
		System.out.println("---Detail Information---");
		
		System.out.println("Audio System:"+audioSystem);
		System.out.println("Number of Doors:"+numberOfDoors);
	}
	
	
	
	
}
