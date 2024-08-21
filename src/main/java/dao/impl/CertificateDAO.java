package dao.impl;

import java.util.List;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.ICertificateDAO;
import entities.Certificate;

@Repository
public class CertificateDAO implements ICertificateDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Certificate> findAll() {
		Session session = sessionFactory.openSession();
		List<Certificate> results = session.createQuery("from Certificate").getResultList();
		session.close();
		return results;
	}

	@Override
	public Certificate getById(Integer id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Certificate certificate = session.get(Certificate.class, id);
		session.getTransaction().commit();
		return certificate;
	}

	@Override
	public void insert(Certificate certificate) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(certificate);
		session.getTransaction().commit();
	}

	@Override
	public void update(Certificate certificate) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(certificate);
		session.getTransaction().commit();
	}

	@Override
	public void delete(Integer id) {
		try {
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			Certificate item = session.get(Certificate.class, id);
			session.remove(item);
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<Certificate> Search(String name) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Certificate where name like :name");
		query.setParameter("name", "%" + name + "%");
		return query.getResultList();
	}
}
