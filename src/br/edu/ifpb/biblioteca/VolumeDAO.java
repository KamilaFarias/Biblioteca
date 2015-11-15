package br.edu.ifpb.biblioteca;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

public class VolumeDAO extends Dao<Volume> {

	@Override
	public Volume getById(String pk) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Volume volume = session.get(Volume.class, pk);
		
		session.getTransaction().commit();
		session.close();
		
		return volume;
	}

	@Override
	public List<Volume> getAll() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Query query = session.getNamedQuery("Volume.getAll");

		@SuppressWarnings("unchecked")
		List<Volume> volumes = query.list();

		session.getTransaction().commit();
		session.close();

		return volumes;
	}	
}
