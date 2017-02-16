package evolution.entity;

public class Wife {
	private int wifeId;
	private String name;
	
	public Wife() {
		
	}
	
	public Wife(String name) {
		this.name = name;
	}
	
	public int getWifeId() {
		return wifeId;
	}
	public void setWifeId(int wifeId) {
		this.wifeId = wifeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Husband getHusband() {
		return husband;
	}
	public void setHusband(Husband husband) {
		this.husband = husband;
	}
	private Husband husband;
}
