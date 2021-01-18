package br.com.hcode.solid.dip.factory;

import br.com.hcode.solid.dip.model.Db;
import br.com.hcode.solid.dip.model.IDbProduct;
import br.com.hcode.solid.dip.model.MongoDBProduct;
import br.com.hcode.solid.dip.model.MySQLProduct;

public class DbProductFactory {

    public static IDbProduct create(Db type) {
        if (type == Db.MYSQL) {
            return new MySQLProduct();
        }else {
            return new MongoDBProduct();
        }
    }

}
