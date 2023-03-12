package za.ac.cput.domain;


/*
Pojo Class
216060133
Luphiwe Sikupela
 */

public class Employee {
    private String empNum;


    private Employee() {
    }

    public Employee(Builder builder) {
        this.empNum = builder.empNum;
    }

    public String getEmpNum() {
        return empNum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNum='" + empNum + '\'' +
                '}';
    }

    public static class Builder {
        private String empNum;


        public Builder setEmpNum(String empNum) {
            this.empNum = empNum;
            return this;
        }

        public Builder copy(Employee employee){
            this.empNum = employee.empNum;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }




    }
}
