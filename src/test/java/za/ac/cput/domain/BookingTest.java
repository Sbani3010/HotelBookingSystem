package za.ac.cput.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {
    @Test
    public void objectEquality(){
        Booking booking = new Booking("001","B21","2 Days",767);
        assertNotNull(booking);
    }

    @Test
    public void ObjectIdentity(){
        Booking booking = new Booking("001","B21","2 Days",767);
        assertSame(booking,booking);
    }
    @Test
    public void failingTest(){
        Booking booking = new Booking("001","B21","2 Days",767);
        System.out.println(booking.toString());
        assertNotNull(booking);
    }

    @Test
    public void timeout(){
        Booking booking = new Booking("001","B21","2 Days",767);
        assertTimeout(Duration.ofMillis(1), () -> {
            booking.getBookingId();
        });
    }
    @Test
    @Disabled("Not implemented Yet")
    public void disablingTest(){
        Assertions.assertEquals(1,1);
    }
}