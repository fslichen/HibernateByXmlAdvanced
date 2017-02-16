package evolution.application;

import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.Session;

import evolution.AnySession;
import evolution.entity.Company;
import evolution.entity.Employee;

public class Many2Many {
	public static void main(String[] args) {
		Session session = AnySession.getSession();
		Employee employee0 = new Employee("Chen");
		Employee employee1 = new Employee("Ling");
		Set<Employee> employees = new LinkedHashSet<>();
		employees.add(employee0);
		employees.add(employee1);
		Company company0 = new Company("Oracle");
		Company company1 = new Company("Microsoft");
		Set<Company> companies = new LinkedHashSet<>();
		companies.add(company0);
		companies.add(company1);
		employee0.setCompanies(companies);
		company0.setEmployees(employees);
		company1.setEmployees(employees);
		session.save(employee0);
		session.getTransaction().commit();
		AnySession.close();
	}
}	
