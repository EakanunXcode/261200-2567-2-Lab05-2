import java.time.LocalDate;

class User {
    private String name;
    private LocalDate dob;

    // Constructor เริ่มต้น
    public User() {
        this.name = null;
        this.dob = LocalDate.now(); // วันที่ปัจจุบัน
    }

    // Constructor แบบกำหนดค่า
    public User(String name, int year, int month, int day) {
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    // ตรวจสอบว่าเป็นวันเกิดหรือไม่
    public boolean isBirthday() {
        LocalDate today = LocalDate.now();
        return today.getMonth() == dob.getMonth() && today.getDayOfMonth() == dob.getDayOfMonth();
    }

    // แสดงข้อความสุขสันต์วันเกิด
    public void displayHappyBirthday() {
        if (isBirthday()) {
            System.out.println("Happy birthday " + this.name + "!");
        }
    }

    // Getter สำหรับ dob
    public LocalDate getDob() {
        return dob;
    }
}

class Admin extends User {
    public Admin(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    // Override displayHappyBirthday เพื่อเพิ่มการแสดงอายุ
    @Override
    public void displayHappyBirthday() {
        if (isBirthday()) {
            LocalDate today = LocalDate.now();
            int age = today.getYear() - getDob().getYear();
            System.out.println("Happy birthday " + this.getClass().getSimpleName() + "! You are " + age + "!");
        }
    }
}

public class Lab05 {
    public static void main(String[] args) {
        // สร้าง object ของ User
        User john = new User("John", 1954, 2, 18);
        john.displayHappyBirthday(); // ทดสอบ User

        // สร้าง object ของ Admin
        Admin nicolas = new Admin("Nicolas", 1964, 1, 7);
        nicolas.displayHappyBirthday(); // ทดสอบ Admin
    }
}