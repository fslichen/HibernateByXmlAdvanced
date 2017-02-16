package evolution.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class City {
	private int cityId;
	private int stateId;// Don't forget to define a foreign key.
	private String name;
	
	public City(String name) {
		this.name = name;
	}
}
