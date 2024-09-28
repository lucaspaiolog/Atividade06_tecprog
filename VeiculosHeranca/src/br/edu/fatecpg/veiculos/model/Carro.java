package br.edu.fatecpg.veiculos.model;

public class Carro extends Veiculo {
	public int num_passageiros;
	public String tipo;
	
	public Carro(String mod, String mrc,
			     int ano, String cor, 
			     int num_pass,String tipo) {
		
		super(mod,mrc,ano,cor);
		this.num_passageiros = num_pass;
		this.tipo = tipo;
	}
	
	public void acelerar() {
		System.out.println("Acelerou");
	}
	
	public void ligarAr() {
		System.out.println("Ligar o ar");
	}
	
}
