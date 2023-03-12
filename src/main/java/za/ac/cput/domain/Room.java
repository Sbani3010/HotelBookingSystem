package za.ac.cput.domain;

public class Room {
  private int roomNo;
  private String roomType;
  private boolean isBooked;

    public Room(int roomNo, String roomType, boolean isBooked) {
        this.roomNo = roomNo;
        this.roomType = roomType;
        this.isBooked = isBooked;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean getBooked() {
        return isBooked;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNo=" + roomNo +
                ", roomType='" + roomType + '\'' +
                ", isBooked=" + isBooked +
                '}';
//

    }
}
