package br.edu.fatecpg.pagamento.model;

public interface Pagamento {
    double calcularPagamento(double valor);
    String emitirRecibo(double valor);
}
