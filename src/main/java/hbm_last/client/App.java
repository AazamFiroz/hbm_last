package hbm_last.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hbm_last.entity.Employee;

public class App {

	public static void main(String[] args) {
		Employee vinay = new Employee();
		vinay.setName("push");
		vinay.setSalary(232323);
		
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(vinay);
		
		tx.commit();
		
	}

}
