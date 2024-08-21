package dao;

import java.util.List;

import entities.Certificate;


public interface ICertificateDAO {
	List<Certificate> findAll();
	Certificate getById(Integer id);
	void insert (Certificate certificate);
	void update (Certificate certificate);
	void delete(Integer id);
	List<Certificate> Search(String name);
}
