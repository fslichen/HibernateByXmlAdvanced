package evolution;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import evolution.entity.Student;

public class Application {
	public static void main(String[] args) {
		// Read hibernate.cfg.xml from src and create configuration.
		Configuration configuration = new Configuration().configure();
		// Create sessionFactory by serviceRegistry.
		ServiceRegistry serviceRegistry = (ServiceRegistry) new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		// Create session. The session has built-in CRUD methods.
		Session session = sessionFactory.openSession();
		// Create an object.
		Student student = new Student();
		student.setId(((Long) Math.round(Math.random() * 10000)).intValue());
		student.setName("Elsa");
		student.setAge(26);
		student.setGender("F");
		// Apply hibernate
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		// Close resouces.
		session.close();
		sessionFactory.close();
	}
}
