package solid.principles.single.responsibility.not.violates;

public class ReportGenerate {

    public void generateReport(Employee employee, Boolean isSalaryCredited) {
        if(isSalaryCredited)
            System.out.println("Salary has been credited for employee - " + employee.getEmployeeName());
        else System.out.println("Salary has not been credited for employee - " + employee.getEmployeeName());
    }
}
