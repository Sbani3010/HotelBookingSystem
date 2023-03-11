package za.ac.cput;

import za.ac.cput.domain.Room;

public class Main {
    public static void main(String[] args) {
       Room rms= new Room(67,"single",true);
        System.out.println(rms.toString());
    }
}