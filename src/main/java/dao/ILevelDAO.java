package dao;

import java.util.List;

import entities.Level;

public interface ILevelDAO {
	List<Level> findAll();
	Level getById(Integer id);
	void insert(Level level);
	void update(Level level);
	void delete(Integer id);
	List<Level> search(String name);
}
