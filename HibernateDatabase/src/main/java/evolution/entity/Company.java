package evolution.entity;

import java.util.Set;

import lombok.Data;

@Data
public class Company {
	private int companyId;
	private String name;
	private Set<Employee> employees;
	
	public Company(String name) {
		this.name = name;
	}
}
