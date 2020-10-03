import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public class Application {

    public static void main(String[] args) {

        System.out.println("Create list of users");
        List<User> users = new ArrayList<>();
        users.add(new User("Anton", "Albu", "antoska96@gmail.com", 24, User.Status.NEW, LocalDate.of(2020, Month.SEPTEMBER, 4)));
        users.add(new User("Tony", "Stark", "Tony96Stark@gmail.com", 35, User.Status.NEW, LocalDate.of(2020, Month.OCTOBER, 2)));
        users.add(new User("Thor", "Hammer", "Kuvalda12@gmail.com2", 36, User.Status.NEW, LocalDate.of(2020, Month.APRIL, 2)));
        users.add(new User("Hulk", "Green", "toosmall@gmail.com", 13, User.Status.NEW, LocalDate.of(2020, Month.SEPTEMBER, 3)));
        users.add(new User("Doctor", "Strange", "brokenFingers@gmail.com", 39, User.Status.NEW, LocalDate.of(2020, Month.MAY, 2)));
        users.add(new User("Ant", "Man", "tiny@gmail.com", 46, User.Status.NEW, LocalDate.of(2020, Month.FEBRUARY, 2)));

        // result list
        for (User user : users) {
            System.out.println(user);
        }

        System.out.println(" SET USER STATUS (ACTIVE/INACTIVE/BLOCKED/STATUS)");

        for (User user : users) {
            User.Status status = ActiveUsers(user.getDate());
            user.setStatus(status);
        }

        System.out.println();

        System.out.println("VIEW MODIFIED LIST");
        for (User user : users) {
            System.out.println(user);
        }
    }

    public static User.Status ActiveUsers(LocalDate date) {

        long daysBetween = DAYS.between(date, LocalDate.now());
        if (daysBetween >= 2 && daysBetween < 30) {
            return
                    User.Status.ACTIVE;
        } else if (daysBetween >= 31) {
            return
                    User.Status.BLOCKED;
        }
        return User.Status.NEW;
    }
}
