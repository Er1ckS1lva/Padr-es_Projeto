package br.edu.iftm.main.decorator;

public class Iorgute extends Adicionais{
			
	Coquetel mod;
		
	public Iorgute(Coquetel mod) {
		this.mod = mod;
	}
		
	@Override
	public double valor() {
			
		return 1.5 + this.mod.valor();
	}

	@Override
	public String getBebida() {
		// TODO Auto-generated method stub
		return mod.getBebida() + " com Iorgute";
	}
}
