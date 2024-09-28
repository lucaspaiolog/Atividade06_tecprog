package br.edu.fatecpg.veiculos.model;

public class Veiculo {
	public String modelo;
	public String marca;
	public int ano;
	public String cor;
	
	public Veiculo(String mod, String mrc, int ano, String cor) {
		this.modelo = mod;
		this.marca = mrc;
		this.ano = ano;
		this.cor = cor;
	}
	
	public void ligar() {
		System.out.println("Ligando...");
		System.out.println("Ligado");
	}
	
	public void desligar() {
		System.out.println("Desligou...");
	}
	
}
