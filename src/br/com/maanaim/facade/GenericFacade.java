package br.com.maanaim.facade;

import java.util.List;

import javax.ejb.Local;

@Local
public interface GenericFacade <T> {

    public abstract void save(T entity);
    
    public abstract T update(T entity);
 
    public abstract void delete(T entity);
 
    public abstract T find(int entityID);
 
    public abstract List<T> findAll();
}
