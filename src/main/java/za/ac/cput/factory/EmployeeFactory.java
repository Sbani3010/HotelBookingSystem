package za.ac.cput.factory;

import za.ac.cput.domain.Employee;
import za.ac.cput.util.Helper;
/*
Factory Class
216060133
Luphiwe Sikupela
 */


public class EmployeeFactory {
    public static Employee createEmployee(String empNum) {
        if (Helper.isNullOrEmpty(empNum)) {
            return null;
        }


        return new Employee.Builder().setEmpNum(empNum).build();
    }
}



