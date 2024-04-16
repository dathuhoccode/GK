public class employee implements IEmployee{
    private final String ID;
    private final String Name;
    private final String BirthDay;
    private final String Phone;
    private final String Email;
    private final String Employee_Type;
    private int Employee_Count;
    public employee(String ID, String Name, String BirthDay, String Phone, String Email, String Employee_Type) {
        this.ID = ID;
        this.Name = Name;
        this.BirthDay = BirthDay;
        this.Phone = Phone;
        this.Email = Email;
        this.Employee_Type = Employee_Type;
        Employee_Count++;
    }
    @Override
    public String showInfo() {
        return ("ID: " + ID + "Full Name: " + Name +"BirthDay: " + BirthDay +"Phone: " + Phone + "Email: " + Email+ "Employee Type: " + Employee_Type);
    }
}
