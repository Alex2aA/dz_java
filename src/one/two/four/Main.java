package one.two.four;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Department department = new Department();
        e1.name = "Ваня";
        department.name = "Веб-программирование";
        department.owner = e1;
        e1.department = department;
        e2.name = "Леша";
        e2.department = department;
        e3.name = "Ваня";
        e3.department = department;

        department.employees = new ArrayList<>() {{
           add(e1);
           add(e2);
           add(e3);
        }};

        System.out.println(department.getAllEmployees(e3));
    }
}
