public class Main {

    public static void main(String[] args) {
        User user1 = new User("Doğukan", "Karasansar", "dkn", "12345678", "student");
        UserManager userManager = new UserManager();
        userManager.login(user1);

        Instructor instructor1 = new Instructor("OOP and Mathematics", "OOP", "Engin", "Demiroğ", "Çarşamba");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.createLesson(instructor1);

        Student student1 = new Student("12-A", "Bilişim Teknolojileri", "Doğukan", "Karasansar");
        StudentManager studentManager = new StudentManager();
        studentManager.addHealthLeave(student1, "Perşembe");




    }
}
