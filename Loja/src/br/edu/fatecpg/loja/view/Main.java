package br.edu.fatecpg.loja.view;
 
import br.edu.fatecpg.loja.model.Faxineiro;
import br.edu.fatecpg.loja.model.Gerente;
 
public class Main {
 
	public static void main(String[] args) {
		//Teste Funcionário
		//Funcionario func = new Funcionario(); deu erro
		
		//Teste Vendedor
		//Vendedor vend = new Vendedor();
		//Teste Faxineiro
		Faxineiro fax = new Faxineiro();
		fax.solicitarMaterial();
		fax.baterPonto();
		//Teste Gerente
		Gerente ger = new Gerente();
		ger.baterPonto();
		ger.fecharCaixa();
		ger.realizarVenda();
	}
}
