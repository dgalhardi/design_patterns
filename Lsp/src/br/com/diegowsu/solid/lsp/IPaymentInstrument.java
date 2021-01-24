package br.com.diegowsu.solid.lsp;

public interface IPaymentInstrument {

    void validate() throws Exception;
    void collectPayment();

}
