package za.ac.cput.domain;
/**
 * This is Booking Pojo class
 * @Author Lehlogonolo Rakgetse 220174954
 * 11 March 2023
 */

public class Booking {
    private String bookingId;
    private String roomNo;
    private String numOfDays;
    private double totalCost;

    public Booking() {
    }

    public Booking(String bookingId, String roomNo, String numOfDays, double totalCost) {
        this.bookingId = bookingId;
        this.roomNo = roomNo;
        this.numOfDays = numOfDays;
        this.totalCost = totalCost;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public String getNumOfDays() {
        return numOfDays;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public void setNumOfDays(String numOfDays) {
        this.numOfDays = numOfDays;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", roomNo='" + roomNo + '\'' +
                ", numOfDays='" + numOfDays + '\'' +
                ", totalCost=" + totalCost +
                '}';
    }
}
