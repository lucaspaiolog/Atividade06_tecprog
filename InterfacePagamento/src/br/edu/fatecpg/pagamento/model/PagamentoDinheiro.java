package br.edu.fatecpg.pagamento.model;

public class PagamentoDinheiro implements Pagamento {
    private static final double DESCONTO = 0.10; // 10% de desconto

    @Override
    public double calcularPagamento(double valor) {
        return valor - (valor * DESCONTO);
    }

    @Override
    public String emitirRecibo(double valor) {
        return "Pagamento em Dinheiro\n" +
               "Valor Original: R$" + valor + "\n" +
               "Desconto de 10%: R$" + (valor * DESCONTO) + "\n" +
               "Total a Pagar: R$" + calcularPagamento(valor);
    }
}
