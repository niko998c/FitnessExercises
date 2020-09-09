public class AdministrationEmployee extends Employee {

    public AdministrationEmployee(String name, String cpr, int hours, int vacation) {
        super(name, cpr, hours, vacation);
    }

    @Override
    public int getSalary() {
        return 33000;
    }
}
