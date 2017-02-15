package evolution.application;

import org.hibernate.Session;

import evolution.AnySession;
import evolution.entity.Student;
import evolution.util.AnyUtil;

public class RollBack {
	public static void main(String[] args) {
		Session session = AnySession.getSession();
		Student student = new Student();
		student.setId(AnyUtil.randomInt());
		student.setName("Chen");
		try {
			session.beginTransaction();
			session.save(student);
			int i = 1 / 0;
			session.getTransaction().commit();
		} catch (Exception e) {
			session.getTransaction().rollback();
			System.out.println("Roll Back Success");
		}
		AnySession.close();
	}
}
