public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        } else {
            double regularPay = 40 * hourlyPayRate;
            double overtimePay = (hoursWorked - 40) * hourlyPayRate * 1.5;
            return regularPay + overtimePay;
        }
    }

    public String displayWeeklyPay(double hoursWorked) {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        double regularPay = Math.min(hoursWorked, 40) * hourlyPayRate;
        double overtimePay = Math.max(hoursWorked - 40, 0) * hourlyPayRate * 1.5;

        return "Regular Hours: 40, Regular Pay: $" + regularPay + ", Overtime Hours: " +
                (hoursWorked > 40 ? hoursWorked - 40 : 0) + ", Overtime Pay: $" + overtimePay +
                ", Total Pay: $" + weeklyPay;
    }
}

