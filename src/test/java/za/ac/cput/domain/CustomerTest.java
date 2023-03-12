package za.ac.cput.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    private final Customer customer = new Customer("Sbani", "Sithole","219446564@mycput.ac.za",769690158);

    @Test
    public void objectEquality() {
        assertEquals("Sithole", customer.getLastName());
    }

    @Test
    public void objectIdentity() {

        assertSame("Sbani", customer.getFirstName());
    }

    @Test
    public void failingTest() {
        assertEquals("sbani3010", customer.getTelNo());
    }

    @Test
    public void timeOutTest() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            objectEquality();
        });
    }

    @Disabled("Test Disabled")
    @Test
    public void disabledTest() {
        assertNotEquals("sbani", customer.getEmail());
    }
}