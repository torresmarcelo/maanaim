package br.com.maanaim.model.dominio;

public enum Perfil {
	ADM("Administrador"), USU("Usu�rio");

	private final String nome;

	Perfil(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
