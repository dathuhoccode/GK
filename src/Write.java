public class Write {
    public static void main(String[] args) {
        // Tạo các đối tượng nhân viên
        Experience expEmployee = new Experience("1", "John Doe", "1990-01-01", "123456789", "john@example.com",
                "Experience", 5, "Java");
        Fresher fresherEmployee = new Fresher("2", "Jane Smith", "1995-05-05", "987654321", "jane@example.com",
                "Fresher", "2020-05-30", "Good", "ABC University");
        Intern internEmployee = new Intern("3", "Michael Johnson", "2000-10-10", "111222333", "michael@example.com",
                "Intern", "Computer Science", "Spring 2024", "XYZ College");

        // Ghi thông tin nhân viên vào file
        FileIO.writeToFile("employees.txt", "Experience: ");
        FileIO.writeToFile("employees.txt", (expEmployee.showInfo()));
        FileIO.writeToFile("employees.txt", "Fresher: ");
        FileIO.writeToFile("employees.txt", fresherEmployee.showInfo());
        FileIO.writeToFile("employees.txt", "Intern: ");
        FileIO.writeToFile("employees.txt", internEmployee.showInfo());
        System.out.println("Thông tin nhân viên đã được ghi vào file 'employees.txt'");
    }
}
