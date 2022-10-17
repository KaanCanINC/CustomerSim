package DatabaseAccess;

import Entities.Product;

public class HiberNateDatabaseDao implements ProductDao{
    public void add(Product product){
        System.out.println("Hibernate Veritabanina eklendi");
    }
}
