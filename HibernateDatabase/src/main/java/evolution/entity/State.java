package evolution.entity;

import java.util.Set;

import lombok.Data;

@Data
public class State {
	private int stateId;
	private String name;
	private Set<City> cities;
}
