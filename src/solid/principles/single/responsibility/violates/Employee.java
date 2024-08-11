package solid.principles.single.responsibility.violates;

public class Employee {
    private Long employeeID;
    private String employeeName;
    private Long employeeSalary;
    //If in future HR wants to add new feature to double check bank whether the salary is credited or not using isSalaryCredited field
    //then the Employee class needs to be modified as the implementation of credit of salary and generation of salary is in the same class.
    //This violates Single Responsibility Principle.
    //Why this is an issue in application sense?
    //Because if in any other place in the application the employee object is created will be affected because of the constructor used.
    //Even if there is a constructor and object of employee is created, we will get NullPointer Exception on those methods where isSalaryCredited used.
    //private Boolean isSalaryCredited;

    public Employee(Long employeeID, String employeeName, Long employeeSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

//    public Employee(Long employeeID, String employeeName, Long employeeSalary, Boolean isSalaryCredited) {
//        this.employeeID = employeeID;
//        this.employeeName = employeeName;
//        this.employeeSalary = employeeSalary;
//        this.isSalaryCredited = isSalaryCredited;
//    }


    public void creditSalary() {

        System.out.println("Salary of " + this.employeeSalary + " INR credited for employee : " + this.employeeName);
//        if(isSalaryCredited) System.out.println("Salary of " + this.employeeSalary + " INR credited for employee : " + this.employeeName);
//        else System.out.println("Salary of " + this.employeeSalary + " INR is not credited for employee : " + this.employeeName);
    }

    public void generateReport() {
        System.out.println("Salary has been credited for employee - " + this.employeeName);
//        if(isSalaryCredited)
//            System.out.println("Salary has been credited for employee - " + this.employeeName);
//        else System.out.println("Salary has not been credited for employee - " + this.employeeName);
    }

}
