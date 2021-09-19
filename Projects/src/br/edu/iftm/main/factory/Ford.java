package br.edu.iftm.main.factory;

public class Ford extends Concessionaria{

	@Override
	public Carro newCar(String car) {
		if (car.equals("Fiesta")) {
			return new FordFiesta();
		}else if(car.equals("Mustang")) {
			return new FordMustang();
		}
		else {
			return null;
		}
	}

}
