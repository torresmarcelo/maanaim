package br.com.maanaim.dao.impl;
import br.com.maanaim.dao.GenericDAO;
import br.com.maanaim.model.Ficha;
 
public class FichaDAO extends GenericDAO<Ficha> {
 
	private static final long serialVersionUID = 1L;
 
    public FichaDAO() {
        super(Ficha.class);
    }
 

}