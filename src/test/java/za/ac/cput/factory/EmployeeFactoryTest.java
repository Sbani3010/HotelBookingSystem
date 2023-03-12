package za.ac.cput.factory;

/*
Test Class
216060133
Luphiwe Sikupela
 */


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;

import java.time.Duration;



import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test

    public void ObjectEquality(){

            Employee employee = EmployeeFactory.createEmployee("2121212");
            System.out.println(employee);
            assertNotNull(employee);
        }

        @Test
        public void ObjectIdentity(){
            Employee employee = EmployeeFactory.createEmployee("2121212");
            System.out.println(employee);
            assertSame(employee,employee);

        }

    @Test
    public void test(){
        Employee employee = EmployeeFactory.createEmployee("2121212");
        System.out.println(employee);
        assertNotNull(employee);
    }


    @Test
    public void test_fail(){
        Employee employee = EmployeeFactory.createEmployee("2121212");
        System.out.println(employee);
        assertNotNull(employee);

    }

    @Test
    public void timeout(){
        Employee employee = EmployeeFactory.createEmployee("2121212");
        assertTimeout(Duration.ofSeconds(1), () -> {
            employee.getEmpNum();
        });
    }
    @Test
    @Disabled("Disabled until new employee number is generated")
    public void generateNewEmp() {
        assertEquals(2, 1 + 3);
    }
    }

