import java.time.LocalDate;

public class Admin extends User{
    private String role;
    public Admin(String name ,int year,int month,int day){
        super(name, year, month, day);
        this.role = "Admin";
    }

    public void displayInfo(boolean full) {
        super.displayInfo();
        if(full == true){
            System.out.println("User Type: " + role);
        }
    }

    @Override
    public void displayHappyBirthday() {
        int age = 0;
        age = LocalDate.now().getYear() - dob.getYear();
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
    }
}
