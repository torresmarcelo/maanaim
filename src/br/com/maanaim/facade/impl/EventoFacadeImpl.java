package br.com.maanaim.facade.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.com.maanaim.dao.impl.EventoDAO;
import br.com.maanaim.facade.GenericFacade;
import br.com.maanaim.model.Evento;

@Stateless
public class EventoFacadeImpl implements GenericFacade<Evento> {
	
    @EJB
    private EventoDAO evtDAO;


	@Override
	public void save(Evento evt) {
        evtDAO.beginTransaction();
        evtDAO.save(evt);
        evtDAO.commitAndCloseTransaction();
	}

	@Override
	public Evento update(Evento evt) {
        evtDAO.beginTransaction();
        Evento persistedEvento = evtDAO.find(evt.getId());
        persistedEvento.setNome(evt.getNome());
    	persistedEvento.setDtInicioEvento(evt.getDtInicioEvento());
    	persistedEvento.setDtFimEvento(evt.getDtFimEvento());
    	persistedEvento.setDtInicioInscricao(evt.getDtInicioInscricao());
    	persistedEvento.setDtFimInscricao(evt.getDtFimInscricao());        
        
        evtDAO.update(persistedEvento);
        evtDAO.commitAndCloseTransaction();
		
		
		return evt;
	}

	@Override
	public void delete(Evento evt) {
        evtDAO.beginTransaction();
        Evento persistedEvento = evtDAO.findReferenceOnly(evt.getId());
        evtDAO.delete(persistedEvento);
        evtDAO.commitAndCloseTransaction();
	}

	@Override
	public Evento find(int evtId) {
        evtDAO.beginTransaction();
        Evento evt = evtDAO.find(evtId);
        evtDAO.closeTransaction();
        return evt;
	}

	@Override
	public List<Evento> findAll() {
        evtDAO.beginTransaction();
        List<Evento> result = evtDAO.findAll();
        evtDAO.closeTransaction();
        return result;
	}


}
