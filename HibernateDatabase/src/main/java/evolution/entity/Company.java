package evolution.entity;

import java.util.Set;

// Hibernate many-to-many mechanism doesn't seem to be compatible with lombok.
public class Company {
	public Company() {
		
	}
	
	private int companyId;
	private String name;
	
	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	private Set<Employee> employees;
	
	public Company(String name) {
		this.name = name;
	}
}
