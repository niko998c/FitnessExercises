import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        DommyData dommyData = new DommyData();
        Set<Employee> employees = dommyData.DommyDataEmployee();
        Set<FitnessMember> members = dommyData.DommyDataMember();

        Print print = new Print();
        print.PrintEmployees(employees);
        print.PrintMembers(members);
        print.PrintAll(employees, members);

        System.out.println("test");
    }
}
