import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Jack", "Gray", "000001", "Mr.", 1999, 22.0));
        workers.add(new Worker("Josh", "Anness", "000002", "Mr.", 1996, 26.50));
        workers.add(new Worker("Anthony", "Jerdack", "54321", "Prof.", 1969, 35.0));

        ArrayList<SalaryWorker> salaryWorkers = new ArrayList<>();
        salaryWorkers.add(new SalaryWorker("Aidan", "George", "11111", "Mr.", 1935, 30000.0));
        salaryWorkers.add(new SalaryWorker("Jack", "Scud", "22222", "Prof.", 1995, 60000.0));
        salaryWorkers.add(new SalaryWorker("Ashley", "Lin", "33333", "Mrs.", 1987, 85000.0));

        System.out.println("Weekly Pay for Workers:");
        simulatePayPeriod(workers, 40); // Week 1 (40 hours)
        simulatePayPeriod(workers, 50); // Week 2 (50 hours)
        simulatePayPeriod(workers, 40); // Week 3 (40 hours)

        System.out.println("\nWeekly Pay for SalaryWorkers:");
        for (SalaryWorker salaryWorker : salaryWorkers) {
            System.out.println(salaryWorker.displayWeeklyPay());
        }
    }

    public static void simulatePayPeriod(ArrayList<Worker> workers, double hoursWorked) {
        for (Worker worker : workers) {
            System.out.println(worker.formalName() + ": " + worker.displayWeeklyPay(hoursWorked));
        }
    }
}
