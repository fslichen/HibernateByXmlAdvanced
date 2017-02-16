package evolution.application;

import java.util.HashSet;

import org.hibernate.Session;

import evolution.AnySession;
import evolution.entity.Company;
import evolution.entity.Employee;

public class Many2Many {
	public static void main(String[] args) {
		Session session = AnySession.getSession();
		Employee employee0 = new Employee("Chen");
		Employee employee1 = new Employee("Ling");
		Company company0 = new Company("Oracle");
		Company company1 = new Company("Microsoft");
		// One Employee -> Many Companies
		employee0.setCompanies(new HashSet<>());
		employee0.getCompanies().add(company0);
		employee0.getCompanies().add(company1);
		employee1.setCompanies(new HashSet<>());
		employee1.getCompanies().add(company0);
		employee1.getCompanies().add(company1);
		// One Company -> Many Employees
		company0.setEmployees(new HashSet<>());
		company0.getEmployees().add(employee0);
		company0.getEmployees().add(employee1);
		company1.setEmployees(new HashSet<>());
		company1.getEmployees().add(employee0);
		company1.getEmployees().add(employee1);
		// Save
		session.save(employee0);
		session.save(employee1);
		// Commit
		session.getTransaction().commit();
		AnySession.close();
	}
}	
