public class Fresher extends employee {
    private final String Graduation_date;
    private final String Graduation_rank;
    private final String Education;

    public Fresher(String id, String name, String birthday, String phone, String email, String employeeType, String graduationDate, String graduationRank, String education){
        super(id, name, birthday, phone, email, employeeType);
        this.Graduation_date = graduationDate;
        this.Graduation_rank = graduationRank;
        this.Education = education;
    }
    @Override
    public String showInfo() {
        super.showInfo();
        return ("Graduation Date: " + Graduation_date + "Graduation Rank: " + Graduation_rank +"Education: " + Education);
    }
}
