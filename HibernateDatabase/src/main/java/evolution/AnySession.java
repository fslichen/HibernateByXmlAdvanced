package evolution;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class AnySession {// Singleton
	public static final int id4Find = 1589;
	public static final int id4Delete = 0;
	private static SessionFactory sessionFactory;
	private static Session session;

	private AnySession() {
		
	}
	
	static {
		// Read hibernate.cfg.xml from src and create configuration.
		Configuration configuration = new Configuration().configure();
		// Create sessionFactory by serviceRegistry.
		ServiceRegistry serviceRegistry = (ServiceRegistry) new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		// Create session. The session has built-in CRUD methods.
		session = sessionFactory.openSession();
		session.beginTransaction();
	}
	
	public static Session getSession() {
		return session;
	}
	
	public static void close() {
		session.close();
		sessionFactory.close();
	}
}
