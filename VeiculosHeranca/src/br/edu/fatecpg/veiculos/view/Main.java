package br.edu.fatecpg.veiculos.view;

import br.edu.fatecpg.veiculos.model.Caminhao;
import br.edu.fatecpg.veiculos.model.Carro;
import br.edu.fatecpg.veiculos.model.Moto;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro ("Renault","Logan",2015,
				                   "Prata",5,"Sedan");
		
		carro.ligarAr();
		carro.acelerar();
		
		carro.ligar();
		carro.desligar();
		
		Moto moto = new Moto("Honda","Bis",2009,
                             "Preta",2);

		moto.empinar();
		moto.acelerar();

		moto.ligar();
		moto.desligar();
		
		Caminhao caminhao = new Caminhao("Mercedes-benz","Actros",2025,
                                         "Azul-escuro",3,"Alimentícia");

		caminhao.buzinar();
		caminhao.ligarRadio();

		caminhao.ligar();
		caminhao.desligar();
	}

}
