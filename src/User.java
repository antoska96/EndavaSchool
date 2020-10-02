import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class User {

    private String firstname;
    private String lastname;
    private String email;
    private String status;
    private LocalDate date;
    private int age;

    public User(String firstname, String lastname, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
        this.date = getDate();
        this.status = getStatus();
    }

    public User(String firstname, String lastname, String email, int age, LocalDate date) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
        this.date = date;
        this.status = getStatus();
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

    public String getStatus() {
        status = "NEW";
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDate() {
        LocalDate date = LocalDate.now();
        return date;
    }

    public void setDate(String time) {
        this.date = date;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void ActiveUsers() {

        long daysBetween = DAYS.between(date, LocalDate.now());
        if (daysBetween >= 2 && daysBetween < 30) {
            setStatus("ACTIVE");
        } else if (daysBetween >= 30) {
            setStatus("INACTIVE");
        }
        if (daysBetween >= 31) {
            setStatus("BLOCKED");
        }
    }


    @Override
    public String toString() {
        return firstname + " " + lastname + ", Age:" + age +
                ", Email:" + email + ", Status:" + status + ", Date:" + date;
    }

}
