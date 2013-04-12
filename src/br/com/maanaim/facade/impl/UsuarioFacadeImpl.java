package br.com.maanaim.facade.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.maanaim.dao.impl.UsuarioDAO;
import br.com.maanaim.facade.GenericFacade;
import br.com.maanaim.model.Usuario;

@Stateless
public class UsuarioFacadeImpl implements GenericFacade<Usuario> {
	
	@EJB
    private UsuarioDAO usuDAO;
    
    public Usuario ehLoginValido(String email, String password) {
        usuDAO.beginTransaction();
        Usuario usu = usuDAO.encontraUsuPorEmail(email);
 
        if (usu == null || !usu.getSenha().equals(password)) {
            return null;
        }
        usuDAO.closeTransaction();
        return usu;
    }

	public void save(Usuario usu) {
		usuDAO.beginTransaction();
		usuDAO.save(usu);
		usuDAO.commitAndCloseTransaction();
	}

	public Usuario update(Usuario usu) {
		
		usuDAO.beginTransaction();
		usuDAO.update(usu);
		usuDAO.commitAndCloseTransaction();
		
		return usu;
	}

	public void delete(Usuario usu) {
		usuDAO.beginTransaction();
		usuDAO.delete(usu);
		usuDAO.commitAndCloseTransaction();
	}

	public Usuario find(int entityID) {
		
		usuDAO.beginTransaction();
		Usuario usu = usuDAO.find(entityID);
		usuDAO.closeTransaction();
		
		return usu;
	}

	public List<Usuario> findAll() {
		
		usuDAO.beginTransaction();
		List<Usuario> listUsu = usuDAO.findAll();
		usuDAO.closeTransaction();
		
		return listUsu;
	}

}
