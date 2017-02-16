package evolution.entity;

import java.util.Set;

// Hibernate many-to-many mechanism doesn't seem to be compatible with lombok.
public class Employee {
	public Employee() {
		
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(Set<Company> companies) {
		this.companies = companies;
	}

	private int employeeId;
	private String name;
	private Set<Company> companies;
	
	public Employee(String name) {
		this.name = name;
	}
}
