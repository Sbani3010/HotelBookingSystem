package za.ac.cput.domain;

public class Admin {
    private String firstName;
    private String lastName;
    private String email;
    private long telNo;
    private String password;
    private String username;

    public Admin(String firstName, String lastName, String email, long telNo, String password, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telNo = telNo;
        this.password = password;
        this.username = username;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
