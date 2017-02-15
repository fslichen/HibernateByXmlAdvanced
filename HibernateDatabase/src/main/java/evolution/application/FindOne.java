package evolution.application;

import org.hibernate.Query;
import org.hibernate.Session;

import evolution.AnySession;
import evolution.entity.Student;

public class FindOne {
	public static void main(String[] args) {
		Session session = AnySession.getSession();
		Query query = session.createQuery("select s from Student s where id = ?");
		query.setParameter(0, AnySession.id4Find);
		Student student = (Student) query.uniqueResult();
		System.out.println(student);
	}
}
