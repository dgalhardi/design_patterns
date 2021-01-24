package br.com.diegowsu.solid.dip.payment;

import br.com.diegowsu.solid.dip.factory.DbProductFactory;
import br.com.diegowsu.solid.dip.model.Db;
import br.com.diegowsu.solid.dip.model.IDbProduct;
import br.com.diegowsu.solid.dip.model.MySQLProduct;

public class Payment {
    public void pay(String productID){

        IDbProduct dbProduct = DbProductFactory.create(Db.MONGODB);
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}
