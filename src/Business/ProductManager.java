package Business;

import Core.Logging.Logger;
import DatabaseAccess.HiberNateDatabaseDao;
import DatabaseAccess.ProductDao;
import Entities.Product;

public class ProductManager{
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception{
        if(product.getUnitPrice() < 1) {
            throw new Exception("Urun fiyati 1den buyuk olmalidir");
        }
        if(product.getName().isEmpty()){
            throw new Exception("Urun ismi Bos olamaz");
        }
        productDao.add(product);
    
        for(Logger logger : loggers){
            logger.log(product.getName());
        }


    }
    
}
