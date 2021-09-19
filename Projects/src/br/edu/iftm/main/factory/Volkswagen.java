package br.edu.iftm.main.factory;

public class Volkswagen extends Concessionaria{

	@Override
	public Carro newCar(String car) {
		
		if (car.equals("Gol")) {
			return new VolksGol();
		}else if(car.equals("Fox")) {
			return new VolksFox();
		}
		else {
			return null;
		}
	}

}
