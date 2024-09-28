package br.edu.fatecpg.pagamento.view;

import br.edu.fatecpg.pagamento.model.Pagamento;
import br.edu.fatecpg.pagamento.model.PagamentoCartao;
import br.edu.fatecpg.pagamento.model.PagamentoDinheiro;

public class Teste {

    public static void main(String[] args) {
        Pagamento pagamentoCartao = new PagamentoCartao();
        Pagamento pagamentoDinheiro = new PagamentoDinheiro();

        double valor = 100.00;

        System.out.println(pagamentoCartao.emitirRecibo(valor));
        System.out.println();
        System.out.println(pagamentoDinheiro.emitirRecibo(valor));
    }

}
