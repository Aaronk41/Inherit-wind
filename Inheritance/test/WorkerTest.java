import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorkerTest {

    @Test
    public void testCalculateWeeklyPay() {
        Worker worker = new Worker("Micah", "Bell", "123000", "Mr.", 1920, 20.0);
        assertEquals(800.0, worker.calculateWeeklyPay(40), 0.01);
        assertEquals(1100.0, worker.calculateWeeklyPay(50), 0.01);
    }

    @Test
    public void testDisplayWeeklyPay() {
        Worker worker = new Worker("Micah", "Bell", "123", "Mr.", 1980, 20.0);
        assertEquals("Regular Hours: 40, Regular Pay: $800.0, Overtime Hours: 10.0, Overtime Pay: $300.0, Total Pay: $1100.0", worker.displayWeeklyPay(50));
    }
}
