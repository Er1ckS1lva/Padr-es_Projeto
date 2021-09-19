package br.edu.iftm.main.decorator;

public abstract class Coquetel {
	
	String Bebida;

    public String getBebida() {
		return this.Bebida;
	}

	public abstract double valor();
		
}
