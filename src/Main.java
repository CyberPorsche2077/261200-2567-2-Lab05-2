import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User John = new User("John", 1954,12,18);
        Admin nicolas = new Admin("nicolas",1964,12,18);

        John.displayInfo();
        John.displayHappyBirthday();
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
        nicolas.displayHappyBirthday();
    }
}