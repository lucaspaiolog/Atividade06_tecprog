package br.edu.fatecpg.pagamento.model;

public class PagamentoCartao implements Pagamento {
    private static final double TAXA = 0.05; // 5% de taxa

    @Override
    public double calcularPagamento(double valor) {
        return valor + (valor * TAXA);
    }

    @Override
    public String emitirRecibo(double valor) {
        return "Pagamento no Cartão\n" +
               "Valor Original: R$" + valor + "\n" +
               "Taxa de 5%: R$" + (valor * TAXA) + "\n" +
               "Total a Pagar: R$" + calcularPagamento(valor);
    }
}