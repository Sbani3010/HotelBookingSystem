package za.ac.cput.domain;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {
    Room rms= new Room(67,"single",true);
    @Disabled("Disabled until CustomerService is up!")
    @Test
     public void test_fail(){
         Room rms= new Room(67,"single",true);
         System.out.println(rms.toString());
         assertNotNull(rms);
     }
    @Disabled("Disabled until CustomerService is up!")
    @Test
    public void objectEquality() {

        Room room1 =new Room(56,"Double",false);

        assertEquals(room1, room1);
    }

    @Test
    public void ObjectIdentity(){
        Room room1 =new Room(56,"Double",false);

       assertSame(room1,room1);

    }
    @Test
    public  void TestTimeout(){
        Room room1 =new Room(56,"Double",false);
        assertTimeout(Duration.ofMillis(1), () -> {
            room1.getRoomNo();
        });
    }




     


}