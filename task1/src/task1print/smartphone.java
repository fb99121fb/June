package task1print;

public class smartphone {
	
	private String devicename;
	
	private String cost;
	
	private String color;
	
	public smartphone(String devicename,String cost,String color) {
		this.devicename=devicename;
		
		this.cost=cost;
		
		this.color=color;
		
	}
	
	
	
	
@Override
public String toString() {
	// TODO Auto-generated method stub
	return devicename ,cost+" ",color;
}

	

}
