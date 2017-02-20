package evolution.entity;

public class Husband {
	private int husbandId;
	private String name;
	private Wife wife;
	
	public Wife getWife() {
		return wife;
	}
	public void setWife(Wife wife) {
		this.wife = wife;
	}
	public int getHusbandId() {
		return husbandId;
	}
	public void setHusbandId(int husbandId) {
		this.husbandId = husbandId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
