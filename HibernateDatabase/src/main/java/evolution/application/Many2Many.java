package evolution.application;

import java.util.HashSet;

import org.hibernate.Session;

import evolution.AnySession;
import evolution.entity.Company;
import evolution.entity.Employee;

public class Many2Many {
	public static void main(String[] args) {
		// 打开Session
		Session session = AnySession.getSession();

		// 保存学生
		Employee s1 = new Employee("小张");
		Employee s2 = new Employee("小明");

		// 保存老师
		Company t1 = new Company("老张");
		Company t2 = new Company("老徐");

		// 建立双向关系
		// 学生->老师
		s1.setCompanies(new HashSet<>());
		s1.getCompanies().add(t1);
		s1.getCompanies().add(t2);
		s2.setCompanies(new HashSet<>());
		s2.getCompanies().add(t1);
		s2.getCompanies().add(t2);

		// 老师->学生
		t1.setEmployees(new HashSet<>());
		t1.getEmployees().add(s1);
		t1.getEmployees().add(s2);
		t2.setEmployees(new HashSet<>());
		t2.getEmployees().add(s1);
		t2.getEmployees().add(s2);

		// 保存数据
		session.save(s1);
		session.save(s2);

		// 提交事务
		session.getTransaction().commit();

		// 关闭
		AnySession.close();
	}
}	
