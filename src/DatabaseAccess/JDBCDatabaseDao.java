package DatabaseAccess;

import Entities.Product;

public class JDBCDatabaseDao implements ProductDao{
    public void add(Product product){
        System.out.println("JDBC Veritabanina eklendi");
    }
}
