package za.ac.cput.domain;

//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class AdminTest {
    private final Admin admin = new Admin("Sbani", "Sithole","219446564@mycput.ac.za",769690158,"sbnai3010@","sbani30");

    @Test
    public void objectEquality() {
        assertEquals("sbanintokozo12345@", admin.getPassword());
    }

    @Test
    public void objectIdentity() {

        assertSame("sbani3010", admin.getUsername());
    }

    @Test
    public void failingTest() {
        assertEquals("sbani3010", admin.getPassword());
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
        assertNotEquals("sbani", admin.getUsername());
    }
}