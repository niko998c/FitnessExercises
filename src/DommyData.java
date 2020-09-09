import java.util.HashSet;
import java.util.Set;

public class DommyData {
    public Set<Employee> DommyDataEmployee() {

        Set<Employee> employees = new HashSet<>();
        employees.add(new AdministrationEmployee("Claus", "221175-1011", 37, 5));
        employees.add(new InstructorsEmployee("Tove", "331175-1011", 20, 0));
        employees.add(new AdministrationEmployee("Anna", "441175-1011", 37, 5));
        employees.add(new InstructorsEmployee("Henning", "551175-1011", 15, 0));

        return employees;
    }
    public Set<FitnessMember> DommyDataMember(){

        Set<FitnessMember> members = new HashSet<>();
        members.add(new FitnessMember("Peter", "123456-1234", "Full"));
        members.add(new FitnessMember("Bob", "223456-1234", "Basic"));
        members.add(new FitnessMember("Martina", "323456-1234", "Full"));
        members.add(new FitnessMember("Line", "423456-1234", "Basic"));

        return members;
    }
}
