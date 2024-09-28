package br.edu.fatecpg.veiculos.model;

public class Moto extends Veiculo {
	public int num_passageiros;
	
	public Moto(String mod, String mrc,
			     int ano, String cor, 
			     int num_pass) {
		
		super(mod,mrc,ano,cor);
		this.num_passageiros = num_pass;
	}
	
	public void acelerar() {
		System.out.println("Acelerou");
	}
	
	public void empinar() {
		System.out.println("Empinou");
	}
	
}

