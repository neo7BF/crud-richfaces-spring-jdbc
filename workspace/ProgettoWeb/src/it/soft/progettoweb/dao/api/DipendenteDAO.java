package it.soft.progettoweb.dao.api;

import java.util.List;

import it.soft.progettoweb.beans.Dipendente;

public interface DipendenteDAO {
	
	public void save(Dipendente d) throws Exception;
	public void update(Dipendente d) throws Exception;
	public void deleteByPk(Integer id)throws Exception;
	public List<Dipendente> findAll()throws Exception;
	public Dipendente findByPk(Integer id)throws Exception;

}
