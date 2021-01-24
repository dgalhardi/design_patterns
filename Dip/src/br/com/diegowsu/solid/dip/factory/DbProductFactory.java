package br.com.diegowsu.solid.dip.factory;

import br.com.diegowsu.solid.dip.model.Db;
import br.com.diegowsu.solid.dip.model.IDbProduct;
import br.com.diegowsu.solid.dip.model.MongoDBProduct;
import br.com.diegowsu.solid.dip.model.MySQLProduct;

public class DbProductFactory {

    public static IDbProduct create(Db type) {
        if (type == Db.MYSQL) {
            return new MySQLProduct();
        }else {
            return new MongoDBProduct();
        }
    }

}
