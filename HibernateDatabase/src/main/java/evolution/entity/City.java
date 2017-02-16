package evolution.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class City {
	private int cityId;
	private String name;
	// Hibernate does not require you to define a foreign key in the pojo.
	// The city table comes with a automatic foreign key.
	
	public City(String name) {
		this.name = name;
	}
}
