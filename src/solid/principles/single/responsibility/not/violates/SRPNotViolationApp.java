package solid.principles.single.responsibility.not.violates;

import solid.principles.single.responsibility.violates.EmployeeDB;

public class SRPNotViolationApp {

    public static void main (String[] args) {
        SalaryCredit salaryCredit = new SalaryCredit();
        ReportGenerate reportGenerate = new ReportGenerate();
        Employee employee = new Employee(1L, "Om Prakash", 2500000L);
        salaryCredit.creditSalary(employee, EmployeeDB.OP.getIsSalaryCredited());
        reportGenerate.generateReport(employee, EmployeeDB.OP.getIsSalaryCredited());

    }
}
