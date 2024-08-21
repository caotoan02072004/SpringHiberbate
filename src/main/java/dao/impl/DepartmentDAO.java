package dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.IDepartmentDAO;
import entities.Department;

@Repository
public class DepartmentDAO implements IDepartmentDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	public java.util.List<Department> findAll() {
		Session session = sessionFactory.openSession();
		List<Department> results = session.createQuery("from Department").getResultList();
		return results;
	}

	@Override
	public Department getById(Integer id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Department item = session.get(Department.class, id);
		session.getTransaction().commit();
		return item;
	}

	@Override
	public void insert(Department department) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(department);
		session.getTransaction().commit();
	}

	@Override
	public void update(Department department) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(department);
		session.getTransaction().commit();
	}

	@Override
	public void delete(Integer id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Department item = session.get(Department.class, id);
		session.remove(item);
		session.getTransaction().commit();
	}

	@Override
	public List<Department> Search(String name) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Department where name like :name");
		query.setParameter("name", "%" + name + "%");
		return query.getResultList();
	}
	
}
