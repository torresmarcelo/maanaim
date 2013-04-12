package br.com.maanaim.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import br.com.maanaim.model.dominio.Perfil;

@Entity
@Table(name = "USUARIO")
@NamedQuery(name = "Usuario.encontraUsuPorEmail", query = "select u from Usuario u where u.email = :email")
public class Usuario {

	public static final String FIND_BY_EMAIL = "Usuario.encontraUsuPorEmail";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(unique = true)
	private String email;
	private String senha;
	private String nome;
	@Enumerated(EnumType.STRING)
	private Perfil perfil;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	@Override
	public int hashCode() {
		return getId();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Usuario) {
			Usuario usu = (Usuario) obj;
			return usu.getEmail().equals(getEmail());
		}

		return false;
	}

}