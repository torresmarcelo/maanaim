package br.com.maanaim.dao.impl;
import br.com.maanaim.dao.GenericDAO;
import br.com.maanaim.model.Pessoa;
 
public class PessoaDAO extends GenericDAO<Pessoa> {
 
    @SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
 
    public PessoaDAO() {
        super(Pessoa.class);
    }
 

}