package solid.principles.single.responsibility.not.violates;

public class SalaryCredit {

    public void creditSalary(Employee employee, Boolean isSalaryCredited) {

       if(isSalaryCredited) System.out.println("Salary of " + employee.getEmployeeSalary() + " INR credited for employee : " + employee.getEmployeeName());
       else System.out.println("Salary of " + employee.getEmployeeSalary() + " INR is not credited for employee : " + employee.getEmployeeName());

    }
}
