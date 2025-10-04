package one.two.four;

public class Employee {
    String name;
    Department department;

    public String toString() {
        if (name == null) return "Не задано имя сотрудника";
        if (department == null) return name + " без отдела";
        if (this == department.owner) return name + " начальник " + department.name;
        return name + " работает в " + department.name + " Начальник " + department.owner.name;
    }
}
