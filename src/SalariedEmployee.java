public class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment; // Return the fixed payment
    }

    @Override
    public double getAverageMonthlySalary() {
        return calculatePay(); // For salaried employees, this is the same as the fixed payment
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name +
                ", Average Monthly Salary: " + String.format("%.2f", calculatePay());
    }
}