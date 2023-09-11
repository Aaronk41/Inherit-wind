import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SalaryWorkerTest {

    @Test
    public void testCalculateWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("Ado", "Kawasaki", "777222", "Ms.", 1996, 50000.0);
        assertEquals(961.54, salaryWorker.calculateWeeklyPay(0), 0.01);
    }

    @Test
    public void testDisplayWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("Ado", "Kawasaki", "777222", "Ms.", 1996, 50000.0);
        assertEquals("Weekly Pay (SalaryWorker): $961.5384615384615", salaryWorker.displayWeeklyPay());
    }
}
