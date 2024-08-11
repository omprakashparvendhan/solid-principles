package solid.principles.single.responsibility.violates;

public class SRPViolationApp {

    public static void main (String[] args) {
        Employee employee = new Employee(1L, "Om Prakash", 25000000L);
        employee.creditSalary();
        employee.generateReport();
//        Employee employee = new Employee(1L, "Om Prakash", 25000000L, EmployeeDB.OP.getIsSalaryCredited());
//        employee.creditSalary();
//        employee.generateReport();
//
//        Employee employeeMahi = new Employee(1L, "Mahitha", 25000000L, EmployeeDB.MAHI.getIsSalaryCredited());
//        employeeMahi.creditSalary();
//        employeeMahi.generateReport();
    }
}
