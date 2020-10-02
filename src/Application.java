import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Application {

    public static void main(String[] args) {

        System.out.println("Create list of users");
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Anton", "Albu", "antoska96@gmail.com", 24));
        users.add(new User("Tony", "Stark", "Tony96Stark@gmail.com", 35));
        users.add(new User("Thor", "Hammer", "Kuvalda12@gmail.com2", 36));
        users.add(new User("Hulk", "Green", "toosmall@gmail.com", 13, LocalDate.of(2020, Month.AUGUST, 02)));
        users.add(new User("Doctor", "Strange", "brokenFingers@gmail.com", 39, LocalDate.of(2020, Month.SEPTEMBER, 02)));
        users.add(new User("Ant", "Man", "tiny@gmail.com", 46, LocalDate.of(2020, Month.SEPTEMBER, 04)));
// result list
        for (User user : users
        ) {
            System.out.println(user);
        }
        System.out.println(" SET USER STATUS (ACTIVE/INACTIVE/BLOCKED/STATUS)");
        for (User user : users
        ) {

            user.ActiveUsers();
        }
        System.out.println();
        System.out.println("VIEW MODIFIED LIST");
        for (User user : users
        ) {
            System.out.println(user);
        }


    }
}
