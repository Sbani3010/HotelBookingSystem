package za.ac.cput.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class testUser {

    @Test
    public void testObjectEquality() {
        User user1 = new User();
        user1.setFirstName("Sinethemba");
        user1.setLastName("Sithela");
        user1.setEmail("sthelasne@gmail.com");
        user1.setTelNo(1234567890);

        User user2 = new User();
        user2.setFirstName("Sinethemba");
        user2.setLastName("Sithela");
        user2.setEmail("sthelasne@gmail.com");
        user2.setTelNo(1234567890);

        assertEquals(user1, user2);
    }
    @Test
    public void testObjectIdentity() {
        User user1 = new User();
        user1.setFirstName("Sinethemba");
        user1.setLastName("Sithela");
        user1.setEmail("sthelasne@gmail.com");
        user1.setTelNo(1234567890);

        User user2 = user1;

        assertSame(user1, user2);
    }
    @Test
    public void testFail(){
        User user1 = new User();
        user1.setFirstName("Sinethemba");
        user1.setLastName("Sithela");
        user1.setEmail("sthelasne@gmail.com");
        user1.setTelNo(1234567890);

        User user2 = new User();
        user2.setFirstName("Sinethemba");
        user2.setLastName("Sithela");
        user2.setEmail("sthelasne@gmail.com");
        user2.setTelNo(1234567890);

        assertEquals(user1, user2);
    }
    @Test
    public void testTimeOut(){
        User user = new User();
        user.setFirstName("Sinethemba");
        user.setLastName("Sithela");
        user.setEmail("sthelasne@gmail.com");
        user.setTelNo(1234567890);
        try {
            Thread.sleep(300);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        assertEquals("Sinethemba", user.getFirstName());
        assertEquals("Sithela", user.getLastName());
        assertEquals("sthelasne@gmail.com", user.getEmail());
        assertEquals(1234567890, user.getTelNo());
    }
    @Test
    public void testDisabled(){
        User user = new User();
        user.setFirstName("Sinethemba");
        user.setLastName("Sithela");
        user.setEmail("sthelasne@gmail.com");
        user.setTelNo(1234567890);

        assertEquals("Sinethemba", user.getFirstName());
        assertEquals("Sithela", user.getLastName());
        assertEquals("sthelasne@gmail.com", user.getEmail());
        assertEquals(1234567890, user.getTelNo());
    }
}
