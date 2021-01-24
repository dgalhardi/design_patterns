package br.com.diegowsu.solid.dip;

import br.com.diegowsu.solid.dip.model.Db;
import br.com.diegowsu.solid.dip.payment.Payment;

public class Main {

    public static void main(String[] args) {

        Payment payment = new Payment();
        payment.pay("250");
    }
}
