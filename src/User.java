import java.time.LocalDate;


public class User {
    public enum Status {ACTIVE, INACTIVE, BLOCKED, NEW}

    private LocalDate date;
    private String firstname;
    private String lastname;
    private String email;
    private int age;
    private Status status;

    public User(String firstname, String lastname, String email, int age, Status Status, LocalDate date) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
        this.date = date;
        status = Status;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + ", Age:" + age +
                ", Email:" + email + ", Status:" + status + ", Date:" + date;
    }

}
