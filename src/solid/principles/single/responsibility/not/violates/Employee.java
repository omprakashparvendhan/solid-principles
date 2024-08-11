package solid.principles.single.responsibility.not.violates;

public class Employee {

    private Long employeeID;
    private final String employeeName;
    private final Long employeeSalary;

    //Now the class doesn't violate SRP cuz it has only single responsibility which is employee Details.
    //When HR came up with isSalaryCredited field they modified in ReportGenerate class and SalaryCredit class


    public String getEmployeeName() {
        return employeeName;
    }
    public Long getEmployeeSalary() {
        return employeeSalary;
    }

    public Employee(Long employeeID, String employeeName, Long employeeSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }
}
