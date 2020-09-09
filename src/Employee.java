public class Employee extends Person{
    int hours;
    int vacation;

    public Employee(String name, String cpr, int hours, int vacation) {
        super(name, cpr);
        this.hours = hours;
        this.vacation = vacation;
    }

    public String getName() {
        return name;
    }

    public String getCpr() {
        return cpr;
    }

    public int getVacation() {
        return vacation;
    }

    public int getSalary() {
        return 0;
    }

    public int getHours() {
        return hours;
    }
}
