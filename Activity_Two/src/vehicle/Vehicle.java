package vehicle;

public class Vehicle {

	
	String make;
	String vehicleNum;
	String fuelType;
	int fuelCapacity;
	int cc;
	public Vehicle(String make, String vehicleNum, String fuelType, int fuelCapacity, int cc) {
		super();
		this.make = make;
		this.vehicleNum = vehicleNum;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getVehicleNum() {
		return vehicleNum;
	}

	public void setVehicleNum(String vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void displayMake()
	{
		System.out.println("***"+make+"***");
	}

	public void displayBasicInfo()
	{
		System.out.println("---BasicInformation---");
		System.out.println("Vehice Number:"+vehicleNum);
		System.out.println("Fuel Capacity:"+fuelCapacity);
		System.out.println("Fuel Type:"+fuelType);
		System.out.println("CC:"+cc);
		
	}
	public void displayDetailInfo() {
		
	}
}
