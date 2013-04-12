package br.com.maanaim.facade;
 
import br.com.maanaim.dao.impl.UsuarioDAO;
import br.com.maanaim.model.Usuario;
 
public class UsuarioFacade {
    private UsuarioDAO usuDAO = new UsuarioDAO();
 
    public Usuario ehLoginValido(String email, String password) {
        usuDAO.beginTransaction();
        Usuario user = usuDAO.encontraUsuPorEmail(email);
 
        if (user == null || !user.getSenha().equals(password)) {
            return null;
        }
 
        return user;
    }
}