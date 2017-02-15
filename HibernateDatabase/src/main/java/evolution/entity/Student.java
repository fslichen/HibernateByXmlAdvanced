package evolution.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class Student {
	private int id;
	private String name;
	private String gender;
	private int age;
	private Date birthday;
	private byte[] document;
	private	List<String> cities;
	private Set<String> states;
	private Map<String, String> statesAndCities;
}
