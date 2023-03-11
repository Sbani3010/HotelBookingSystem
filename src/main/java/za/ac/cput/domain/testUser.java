package za.ac.cput.domain;

import org.junit.Test;
import za.ac.cput.domain.User;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class testUser {

    @Test
    public void testObjectEquality() {

        User user1 = new User();
        user1.setFirstName("Sinethemba");
        user1.setLastName("Sithela");
        user1.setEmail("sthelasne@gmail.com");
        user1.setTelNo(219112940);

        User user2 = new User();
        user2.setFirstName("Zen");
        user2.setLastName("Jazz");
        user2.setEmail("zjazz@gmail.com");
        user2.setTelNo(213456789);

        assertEquals(user1, user2);
    }
    @Test
    public void testObjectIdentity() {
        User user1 = new User();
        User user2 = new User();

        assertNotSame(user1, user2);
    }
    @Test
    public void testFail(){
        User user1 = new User();
        user1.setFirstName("Sinethemba");
        user1.setLastName("Sithela");
        user1.setEmail("sthelasne@gmail.com");
        user1.setTelNo(219112940);

        User user2 = new User();
        user2.setFirstName("Zen");
        user2.setLastName("Jazz");
        user2.setEmail("zjazz@gmail.com");
        user2.setTelNo(213456789);

        assertEquals(user1, user2);
    }
    @Test
    public void testTimeOut(){
        User user = new User();
        while (true){

        }
    }
    @Test
    public void testDisabled(){

    }
}
