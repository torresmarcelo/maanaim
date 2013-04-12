package br.com.maanaim.model;

import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	private Date dtInicioEvento;
	private Date dtFimEvento;
	private Date dtInicioInscricao;
	private Date dtFimInscricao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDtInicioEvento() {
		return dtInicioEvento;
	}
	public void setDtInicioEvento(Date dtInicioEvento) {
		this.dtInicioEvento = dtInicioEvento;
	}
	public Date getDtFimEvento() {
		return dtFimEvento;
	}
	public void setDtFimEvento(Date dtFimEvento) {
		this.dtFimEvento = dtFimEvento;
	}
	public Date getDtInicioInscricao() {
		return dtInicioInscricao;
	}
	public void setDtInicioInscricao(Date dtInicioInscricao) {
		this.dtInicioInscricao = dtInicioInscricao;
	}
	public Date getDtFimInscricao() {
		return dtFimInscricao;
	}
	public void setDtFimInscricao(Date dtFimInscricao) {
		this.dtFimInscricao = dtFimInscricao;
	}
	

}
