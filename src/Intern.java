public class Intern extends employee{
    private final String Majors;
    private final String Semester;
    private final String University_name;
    public Intern(String ID, String Name, String BirthDay, String Phone, String Email, String Employee_Type, String majors, String semester, String universityName) {
        super(ID, Name, BirthDay, Phone, Email, Employee_Type);
        this.Majors = majors;
        Semester = semester;
        University_name = universityName;
    }
    @Override
    public String showInfo() {
        super.showInfo();
        return ("Experience In Year: " + Majors +"Professional Skill: " + Semester+ "Professional Skill: " + University_name);
    }
}
