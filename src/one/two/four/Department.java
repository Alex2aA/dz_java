package one.two.four;

import java.util.ArrayList;
import java.util.List;

public class Department {
    String name;
    Employee owner;
    List<Employee> employees = new ArrayList<>();

    public String toString() {
        if (this.name == null && this.owner == null) return "отдел без параметров";
        String name = "без имени";
        String depName = "без имени";
        if (this.name != null) depName = this.name;
        if (this.owner != null && owner.name != null) name = owner.name;
        return depName + "начальник " + name;
    }

    public StringBuilder getAllEmployees(Employee employee) {

        StringBuilder result = new StringBuilder();

        if(employee.department.name == this.name) {
            if (employees.isEmpty()) result.append("Работников в этом отделе нету");
            else {
                employees.forEach( employeeInList -> {
                    result.append(employeeInList.name).append("\n");
                });
            }
        }
        return result;
    }

}
