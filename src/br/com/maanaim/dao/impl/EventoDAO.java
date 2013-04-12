package br.com.maanaim.dao.impl;

import javax.ejb.Stateless;

import br.com.maanaim.dao.GenericDAO;
import br.com.maanaim.model.Evento;


@Stateless
public class EventoDAO extends GenericDAO<Evento> {

	private static final long serialVersionUID = 1L;

	public EventoDAO() {
		super(Evento.class);
	}

}