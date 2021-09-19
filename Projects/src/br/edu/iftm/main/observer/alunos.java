package br.edu.iftm.main.observer;

public class alunos {
	
private String Nome;
	
	
	public alunos(String Nome) {
		setNome(Nome);	
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public String getNome() {
		return this.Nome;
	}

	public void Notified() {
		System.out.println(this.getNome() + " recebeu o novo volume.");
	}
}
