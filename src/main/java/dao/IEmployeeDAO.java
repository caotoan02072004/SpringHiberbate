package dao;

import java.util.List;

import entities.Employee;

public interface IEmployeeDAO {
	List<Employee> findAll();
	Employee getById(Integer id);
	void insert(Employee employee);
	void update(Employee employee);
	void delete(Integer id);
	List<Employee> search(String name);
}
