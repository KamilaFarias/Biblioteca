package br.edu.ifpb.biblioteca;

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

}
