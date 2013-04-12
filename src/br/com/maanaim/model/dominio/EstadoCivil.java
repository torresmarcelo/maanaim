package br.com.maanaim.model.dominio;

public enum EstadoCivil {
	SO("Solteiro"), CA("Casado"), SE("Separado"), DI("Divorciado");

	private final String nome;

	EstadoCivil(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
