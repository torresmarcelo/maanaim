package br.com.maanaim.facade;
 
import java.util.List;

import br.com.maanaim.dao.impl.EventoDAO;
import br.com.maanaim.model.Evento;
 
public class EventoFacade {
    private static final long serialVersionUID = 1L;
    
    private EventoDAO evtDAO = new EventoDAO();
 
    public void createEvento(Evento evt) {
        evtDAO.beginTransaction();
        evtDAO.save(evt);
        evtDAO.commitAndCloseTransaction();
    }
 
    public void updateEvento(Evento evt) {
        evtDAO.beginTransaction();
        Evento persistedEvento = evtDAO.find(evt.getId());
        persistedEvento.setNome(evt.getNome());
    	persistedEvento.setDtInicioEvento(evt.getDtInicioEvento());
    	persistedEvento.setDtFimEvento(evt.getDtFimEvento());
    	persistedEvento.setDtInicioInscricao(evt.getDtInicioInscricao());
    	persistedEvento.setDtFimInscricao(evt.getDtFimInscricao());        
        
        evtDAO.update(persistedEvento);
        evtDAO.commitAndCloseTransaction();
    }
 
    public Evento findEvento(int evtId) {
        evtDAO.beginTransaction();
        Evento evt = evtDAO.find(evtId);
        evtDAO.closeTransaction();
        return evt;
    }
 
    public List<Evento> listAll() {
        evtDAO.beginTransaction();
        List<Evento> result = evtDAO.findAll();
        evtDAO.closeTransaction();
        return result;
    }
 
    public void deleteEvento(Evento evt) {
        evtDAO.beginTransaction();
        Evento persistedEvento = evtDAO.findReferenceOnly(evt.getId());
        evtDAO.delete(persistedEvento);
        evtDAO.commitAndCloseTransaction();
    }
}