package evolution.entity;

import java.util.Set;

import lombok.Data;

@Data
public class Employee {
	private int employeeId;
	private String name;
	private Set<Company> companies;
	
	public Employee(String name) {
		this.name = name;
	}
}
