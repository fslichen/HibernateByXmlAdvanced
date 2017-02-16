package evolution.application;

import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.Session;

import evolution.AnySession;
import evolution.entity.City;
import evolution.entity.State;

public class One2Many {
	public static void main(String[] args) {
		Session session = AnySession.getSession();
		State state = new State();
		state.setName("IL");
		City city0 = new City("Urbana");
		City city1 = new City("Champaign");
		Set<City> cities = new LinkedHashSet<>();
		cities.add(city0);
		cities.add(city1);
		state.setCities(cities);
		session.save(city0);
		session.save(city1);
		session.save(state);
		session.getTransaction().commit();
		AnySession.close();
	}
}
