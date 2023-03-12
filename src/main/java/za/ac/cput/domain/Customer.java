package za.ac.cput.domain;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private long telNo;

    public Customer(String firstName, String lastName, String email, long telNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telNo = telNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelNo(long telNo) {
        this.telNo = telNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public long getTelNo() {
        return telNo;
    }
}
