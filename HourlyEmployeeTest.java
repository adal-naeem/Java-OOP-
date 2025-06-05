class HourlyEmployee extends Employee {
    private double hours;  // Total hours worked
    private double wage;   // Wage per hour

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
        super(firstName, lastName, ssn);
        setWage(wage);
        setHours(hours);
    }

    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Wage must be non-negative.");
        }
        this.wage = wage;
    }

    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168) { // Max hours in a week = 168
            throw new IllegalArgumentException("Hours worked must be between 0 and 168.");
        }
        this.hours = hours;
    }

    public double earnings() {
        if (hours <= 40) {
            return hours * wage;  // Regular pay
        } else {
            return (40 * wage) + ((hours - 40) * wage * 1.5);  // Overtime pay
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Hours Worked: " + hours + ", Wage per Hour: " + wage + ", Earnings: " + earnings();
    }
}

// **Test Class**n
public class HourlyEmployeeTest {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmp = new HourlyEmployee("Alice", "Johnson", "555-55-5555", 20.0, 45);
        System.out.println(hourlyEmp);
    }
}
