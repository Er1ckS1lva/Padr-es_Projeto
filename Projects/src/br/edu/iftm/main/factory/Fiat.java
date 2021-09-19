package br.edu.iftm.main.factory;

public class Fiat extends Concessionaria{

	@Override
	public Carro newCar(String car) {
		
		if (car.equals("Uno")) {
			return new FiatUno();
		}else if(car.equals("Palio")) {
			return new FiatPalio();
		}else {
			return null;
		}
		
	}

}
