package dao;

import java.util.List;

import entities.Department;

public interface IDepartmentDAO {
	List<Department> findAll();
	Department getById(Integer id);
	void insert (Department department);
	void update (Department department);
	void delete(Integer id);
	List<Department> Search(String name);
}
