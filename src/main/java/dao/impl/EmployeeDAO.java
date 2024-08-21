package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.IEmployeeDAO;
import entities.Employee;

@Repository
public class EmployeeDAO implements IEmployeeDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Employee> findAll() {
		Session session = sessionFactory.openSession();
		List<Employee> results = session.createQuery("from Employee").getResultList();
		return results;
	}

	@Override
	public Employee getById(Integer id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Employee employee = session.get(Employee.class, id);
		session.getTransaction().commit();
		return employee;
	}

	@Override
	public void insert(Employee employee) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
	}

	@Override
	public void update(Employee employee) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(employee);
		session.getTransaction().commit();
	}

	@Override
	public void delete(Integer id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Employee item = session.get(Employee.class, id);
		session.remove(item);
		session.getTransaction().commit();
	}

	@Override
	public List<Employee> search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
