package br.edu.iftm.main.factory;

public abstract class Carro {
	
	String modelo;
	int ano;
	String motor;
	String cor;
	Boolean bancoCouro;
	Boolean vidroEletrico;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Boolean getBancoCouro() {
		return bancoCouro;
	}

	public void setBancoCouro(Boolean bancoCouro) {
		this.bancoCouro = bancoCouro;
	}

	public Boolean getVidroEletrico() {
		return vidroEletrico;
	}

	public void setVidroEletrico(Boolean vidroEletrico) {
		this.vidroEletrico = vidroEletrico;
	}


	public void confirmandoInfo(){
		
		System.out.println("Carro modelo: "+this.getModelo());
		System.out.println("Carro ano: "+this.getAno());
		System.out.println("Carro cor: "+this.getCor());
		System.out.println("Carro motor: "+this.getMotor());
		System.out.println("Carro Banco de Couro: "+this.getBancoCouro());
		System.out.println("Carro Vidro Elétrico: "+this.getVidroEletrico());
		
	}
	
	public void montandoCarro() {
		
		System.out.println("O carro "+this.getModelo()+" "+ this.getAno()+ " esta sendo montado na fabrica.");
		if(this.getBancoCouro()) {
			System.out.println("Banco de couro adicionado.");
		}
		if(this.getVidroEletrico()) {
			System.out.println("Banco de couro adicionado.");
		}
		
	}
	
	public void testandoCarro() {
		
		System.out.println("O carro " +this.getModelo()+" "+ this.getAno()+ " esta sendo testado.");
	}
	
	public void transportandoCarro() {
		
		System.out.println("O carro está sendo transportado até a concessionaria.");
		
	}
	
	public void entregandoCarro() {
		
		System.out.println("O carro foi entregue na concessionaria.");
		
	}
	

}
