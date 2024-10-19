public abstract class Employee implements Payable {
    protected String employeeId;
    protected String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getAverageMonthlySalary();

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name + ", Average Monthly Salary: " + String.format("%.2f", calculatePay());
    }
}