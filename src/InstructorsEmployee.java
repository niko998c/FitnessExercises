public class InstructorsEmployee extends Employee{

    public InstructorsEmployee(String name, String cpr, int hours, int vacation) {
        super(name, cpr, hours, vacation);
    }

    @Override
    public int getSalary() {
        return ((hours * 52) / 12) * 199;
    }
}
