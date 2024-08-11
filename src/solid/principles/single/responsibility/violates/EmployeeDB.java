package solid.principles.single.responsibility.violates;

public enum EmployeeDB {
    OP(true),
    MAHI(false);

    private final Boolean isSalaryCredited;

    EmployeeDB(Boolean isSalaryCredited) {
        this.isSalaryCredited = isSalaryCredited;
    }

    public Boolean getIsSalaryCredited() {
        return this.isSalaryCredited;
    }
}
