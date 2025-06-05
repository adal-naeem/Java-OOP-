class Employee {
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + ", SSN: " + socialSecurityNumber;
    }
}

class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return super.toString() + ", Gross Sales: " + grossSales + ", Commission Rate: " + commissionRate;
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double earnings() {
        return baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return super.toString() + ", Base Salary: " + baseSalary;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("John", "Doe", "123-45-6789", 5000, 0.10);
        BasePlusCommissionEmployee basePlusEmployee = new BasePlusCommissionEmployee("Jane", "Smith", "987-65-4321", 4000, 0.12, 1000);

        System.out.println(commissionEmployee);
        System.out.println("Earnings: " + commissionEmployee.earnings());
        
        System.out.println(basePlusEmployee);
        System.out.println("Earnings: " + basePlusEmployee.earnings());
    }
}