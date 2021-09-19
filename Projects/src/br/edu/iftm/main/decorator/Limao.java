package br.edu.iftm.main.decorator;

public class Limao extends Adicionais{
	
	Coquetel mod;
	
	public Limao(Coquetel mod) {
		this.mod = mod;
	}
		
	@Override
	public double valor() {
			
		return 1.5 + this.mod.valor();
	}

	@Override
	public String getBebida() {
		// TODO Auto-generated method stub
		return mod.getBebida() + " com Limão";
	}

}
