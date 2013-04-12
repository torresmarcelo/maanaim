package br.com.maanaim.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Ficha {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne
	private Pessoa pessoa;
	private boolean possuiBarraca;
	private String obsRestricao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public boolean isPossuiBarraca() {
		return possuiBarraca;
	}
	public void setPossuiBarraca(boolean possuiBarraca) {
		this.possuiBarraca = possuiBarraca;
	}
	public String getObsRestricao() {
		return obsRestricao;
	}
	public void setObsRestricao(String obsRestricao) {
		this.obsRestricao = obsRestricao;
	}
	
	
}
