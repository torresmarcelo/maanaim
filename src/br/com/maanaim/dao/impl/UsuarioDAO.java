package br.com.maanaim.dao.impl;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;

import br.com.maanaim.dao.GenericDAO;
import br.com.maanaim.model.Usuario;
 
@Stateless
public class UsuarioDAO extends GenericDAO<Usuario> {
 
	private static final long serialVersionUID = 1L;
 
    public UsuarioDAO() {
        super(Usuario.class);
    }
 
    public Usuario encontraUsuPorEmail(String email){
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("email", email);     
 
        return super.findOneResult(Usuario.FIND_BY_EMAIL, parameters);
    }
}