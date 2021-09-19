package br.edu.iftm.main;

import br.edu.iftm.main.decorator.Acucar;
import br.edu.iftm.main.decorator.Coquetel;
import br.edu.iftm.main.decorator.CubaLibre;
import br.edu.iftm.main.decorator.Energetico;
import br.edu.iftm.main.decorator.Iorgute;
import br.edu.iftm.main.decorator.LeiteCondensado;
import br.edu.iftm.main.decorator.Limao;
import br.edu.iftm.main.decorator.Whisky;
import br.edu.iftm.main.factory.Carro;
import br.edu.iftm.main.factory.Chevrolet;
import br.edu.iftm.main.factory.Concessionaria;
import br.edu.iftm.main.factory.Fiat;
import br.edu.iftm.main.factory.Ford;
import br.edu.iftm.main.factory.Volkswagen;
import br.edu.iftm.main.observer.alunos;
import br.edu.iftm.main.observer.revistas;

public class Principal {

    public static void main(String[] args) {
    	
		//OBSERVER
    	
    	/*
    	revistas recreio = new revistas("Recreio Pokemon",1,"2000","www.recreio.com.br");		
    	alunos aluno1 = new alunos("Erick Silva Almeida");
    	alunos aluno2 = new alunos("Nome aluno 2");
    	alunos aluno3 = new alunos("Nome aluno 3");
    	alunos aluno4 = new alunos("Nome aluno 4");			
    	recreio.inscricao(aluno1);
    	recreio.inscricao(aluno2);
    	recreio.inscricao(aluno3);
    	recreio.inscricao(aluno4);
    	recreio.desligar(aluno4);
    	recreio.verInscritos();
    	recreio.novoVolume("Recreio Digimon", 2, "19/10/1999", "www.recreio.com.br");
 		*/
    	
    	//DECORATOR
    	
    	/*
    	Coquetel bebida1 = new Whisky();
    	bebida1 = new Limao(bebida1);
    	bebida1 = new Energetico(bebida1);
    	
    	Coquetel bebida2 = new CubaLibre();
    	bebida2 = new Limao(bebida2);
    	bebida2 = new Energetico(bebida2);
    	bebida2 = new Iorgute(bebida2);
    	bebida2 = new LeiteCondensado(bebida2);
    	bebida2 = new Acucar(bebida2);
    	
    	
    	
    	System.out.println(bebida1.getBebida() + " R$"+ bebida1.valor());
    	System.out.println(bebida2.getBebida() + " R$"+ bebida2.valor());
    	*/
    	
    	//FACTORY
    	
    	Concessionaria fiat = new Fiat();
    	Concessionaria volks = new Volkswagen();
    	Concessionaria chev = new Chevrolet();
    	Concessionaria ford = new Ford();
    	
    	Carro car = fiat.novoCarro("Uno");
    	car = volks.novoCarro("Gol");
    	car = chev.novoCarro("Camaro");
    	car = ford.novoCarro("Mustang");
    	
    	
    	
    	
      
    }
    
}
