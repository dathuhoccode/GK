public class Experience extends employee {
    private final int expInYear;
    private final String proSkill;

    public Experience(String id, String fullName, String birthDay, String phone, String email, String employeeType,
                      int expInYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, employeeType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    @Override
    public String showInfo() {

        return (super.showInfo() +","+ expInYear + "," + proSkill);
    }
}
