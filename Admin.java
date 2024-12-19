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