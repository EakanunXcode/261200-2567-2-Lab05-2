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