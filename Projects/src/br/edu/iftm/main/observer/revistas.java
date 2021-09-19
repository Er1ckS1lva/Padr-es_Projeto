package br.edu.iftm.main.observer;

import java.util.ArrayList;

public class revistas{
	
	private String nomeRevista;
	private int Edicao;
	private String anoPublicacao;
	private String link;
	private ArrayList<alunos> registrados = new ArrayList<alunos>();
	
	public String getNomeRevista() {
		return nomeRevista;
	}

	public void setNomeRevista(String nomeRevista) {
		this.nomeRevista = nomeRevista;
	}

	public int getEdicao() {
		return Edicao;
	}

	public void setEdicao(int edicao) {
		Edicao = edicao;
	}

	public String getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public revistas(String nome, int edit, String ano, String link){
		
		this.setAnoPublicacao(ano);
		this.setEdicao(edit);
		this.setNomeRevista(nome);
		this.setLink(link);
		
	}
	
	public void inscricao(alunos Nome) {
		this.registrados.add(Nome);
		System.out.println("\nO aluno "+Nome.getNome()+" foi inscrito na revista "+this.getNomeRevista());
	}
	
	public void desligar(alunos Nome) {
		this.registrados.remove(Nome);
		System.out.println("\nO aluno "+Nome.getNome()+" teve sua inscrição retirada na revista "+this.getNomeRevista());
	}
	
	public void verInscritos() {
		System.out.println("\nAlunos registrados na revista "+getNomeRevista());
		for(int i =0; i < this.registrados.size(); i++) {
			System.out.println("* "+this.registrados.get(i).getNome());
		}
	}
	
	public void novoVolume(String nome, int edit, String ano, String link){
		
		this.setAnoPublicacao(ano);
		this.setEdicao(edit);
		this.setNomeRevista(nome);
		this.setLink(link);
		
		System.out.println("\nNovo volume da revista saiu ' "+ nome + " '");
		updateInscritos();
	}
	
	public void updateInscritos() {
		
		for(int i =0; i < this.registrados.size(); i++) {
			this.registrados.get(i).Notified();
		}
		
	}


}
