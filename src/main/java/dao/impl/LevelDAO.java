package dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.ILevelDAO;
import entities.Level;


@Repository
public class LevelDAO implements ILevelDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Level> findAll() {
		Session session = sessionFactory.openSession();
		List<Level> results = session.createQuery("from Level").getResultList();
		return results;
	}

	@Override
	public Level getById(Integer id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Level item = session.get(Level.class, id);
		session.getTransaction().commit();
		return item;
	}

	@Override
	public void insert(Level level) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(level);
		session.getTransaction().commit();
	}

	@Override
	public void update(Level level) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(level);
		session.getTransaction().commit();
	}

	@Override
	public void delete(Integer id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Level item = session.get(Level.class, id);
		session.remove(item);
		session.getTransaction().commit();
	}

	@Override
	public List<Level> search(String name) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Level where name like :name");
		query.setParameter("name", "%" + name + "%");
		return query.getResultList();
	}

}
