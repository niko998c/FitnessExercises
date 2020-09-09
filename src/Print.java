import java.util.Set;

public class Print {
    public void PrintEmployees(Set<Employee> employees){
        System.out.println("Fitness Employees");
        System.out.printf("%1$1s %2$13s %3$18s %4$10s %5$14s%n","Name", "Cpr", "Hours", "Salary", "Vacation");
        Print.stars();
        for(Employee e : employees){
            System.out.printf("%1$10s %2$14s %3$8s %4$12s %5$8s%n", e.getName(), e.getCpr(), e.getHours(), e.getSalary(), e.getVacation());
        }
        Print.line();
    }
    public void PrintMembers(Set<FitnessMember> members){
        System.out.println("Fitness Members");
        System.out.printf("%1$1s %2$12s %3$24s %4$6s%n","Name", "Cpr", "Member type", "fee");
        Print.stars();
        for(FitnessMember m : members){
            System.out.printf("%1$10s %2$14s %3$10s %4$12s%n", m.getName(), m.getCpr(), m.getMemberType(), m.getFee());
        }
        Print.line();
    }
    public void PrintAll(Set<Employee> employees, Set<FitnessMember> members){
        System.out.println("Employees & Members: Name & cpr");
        System.out.printf("%1$1s %2$12s%n","Name", "Cpr");
        Print.stars();
        for(Employee e : employees){
            System.out.printf("%1$10s %2$14s%n", e.getName(), e.getCpr());
        }
        for(FitnessMember m : members){
            System.out.printf("%1$10s %2$14s%n", m.getName(), m.getCpr());
        }
    }
    private static void stars(){
        System.out.println("***************************************************************");
    }
    private static void line(){
        System.out.println("===============================================================\n");
    }
}
