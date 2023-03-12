package za.ac.cput.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private final User user = new User("Sbani", "Sithole","219446564@mycput.ac.za",769690158);

    @Test
    public void objectEquality() {
        assertEquals("Sbani", user.getFirstName());
    }

    @Test
    public void objectIdentity() {

        assertSame("Sithole", user.getLastName());
    }

    @Test
    public void failingTest() {
        assertEquals("sbani3010", user.getEmail());
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
        assertNotEquals("sbani", user.getFirstName());
    }
}