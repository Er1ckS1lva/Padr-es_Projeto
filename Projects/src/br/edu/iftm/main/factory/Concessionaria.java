package br.edu.iftm.main.factory;

public abstract class Concessionaria {
	
	public abstract Carro newCar(String car);
	
	public Carro novoCarro(String carro) {
		
		Carro moto = newCar(carro);
		
		System.out.println(" \n Seu pedido de um novo carro modelo "+moto.getModelo()+ " foi realizado com sucesso!");
		moto.confirmandoInfo();
		moto.montandoCarro();
		moto.testandoCarro();
		moto.transportandoCarro();
		moto.entregandoCarro();

		return moto;
	}

}
