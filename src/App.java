import Business.CustomerManager;
import Business.EmployeeManager;
import Business.ProductManager;
import Core.Logging.DatabaseLogger;
import Core.Logging.FileLogger;
import Core.Logging.Logger;
import Core.Logging.MailLogger;
import DatabaseAccess.HiberNateDatabaseDao;
import DatabaseAccess.ProductDao;
import Entities.Customer;
import Entities.Employee;
import Entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Product product = new Product(
                1,
                "Seduna",
                "Ofis Koltugu",
                "SEDUNA",
                1899);

            Logger[] logger = new Logger[] {
                new MailLogger(), new DatabaseLogger(), new FileLogger()
            };

            ProductManager productManager = new ProductManager(new HiberNateDatabaseDao() , logger);
            productManager.add(product);
    
            Customer customer = new Customer();
            Employee employee = new Employee(2,25,"KaanCan","Incirkus",5500);
            EmployeeManager employeeManager = new EmployeeManager();
            CustomerManager customerManager = new CustomerManager();
            
            employeeManager.bestEmpyloyee(employee);
    
    }
}
