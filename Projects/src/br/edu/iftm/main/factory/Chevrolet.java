package br.edu.iftm.main.factory;

public class Chevrolet extends Concessionaria{

	@Override
	public Carro newCar(String car) {
		
		if (car.equals("Camaro")) {
			return new ChevCamaro();
		}else if(car.equals("Celta")) {
			return new ChevCelta();
		}else {
			return null;
		}

	}

}
