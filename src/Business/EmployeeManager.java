package Business;

import Entities.Employee;

public class EmployeeManager extends PersonManager{
    public void bestEmpyloyee(Employee employee){
        System.out.println("Ayin elemani " + employee.getId() + ": " + employee.getFirstname());
    }
}
