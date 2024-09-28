package br.edu.fatecpg.veiculos.model;

public class Caminhao extends Veiculo {
	public int num_passageiros;
	public String tipo_carga;
	
	public Caminhao(String mod, String mrc,
			     int ano, String cor, 
			     int num_pass,String tipo) {
		
		super(mod,mrc,ano,cor);
		this.num_passageiros = num_pass;
		this.tipo_carga = tipo;
	}
	
	public void buzinar() {
		System.out.println("Buzinou");
	}
	
	public void ligarRadio() {
		System.out.println("Ligou o rádio");
	}
	
}