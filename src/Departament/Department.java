package Departament;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Employee owner;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name != null ? name : "Отдел без названия";
    }

    public String getName() {
        return name;
    }

    public Employee getOwner() {
        return owner;
    }

    public void setOwner(Employee owner) {
        if (owner == null) {
            this.owner = null;
            return;
        }

        if (owner.getDepartment() != this) {
            owner.setDepartment(this);
        }

        this.owner = owner;

        if (!employees.contains(owner)) {
            employees.add(owner);
        }
    }

    public void addEmployee(Employee employee) {
        if (employee != null && !employees.contains(employee)) {
            employees.add(employee);
            if (employee.getDepartment() != this) {
                employee.setDepartment(this);
            }
        }
    }

    public void removeEmployee(Employee employee) {
        if (employee != null) {
            employees.remove(employee);
            if (this.owner == employee) {
                this.owner = null;
            }
            if (employee.getDepartment() == this) {
                employee.setDepartment(null);
            }
        }
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    @Override
    public String toString() {
        if (this.name == null && this.owner == null) return "отдел без параметров";

        String depName = (this.name != null) ? this.name : "без имени";
        String ownerName = "не назначен";

        if (this.owner != null && this.owner.getName() != null) {
            ownerName = this.owner.getName();
        }

        return depName + ". Начальник: " + ownerName;
    }

    public String getAllEmployees() {
        StringBuilder result = new StringBuilder();

        if (employees.isEmpty()) {
            result.append("Работников в этом отделе нет");
        } else {
            result.append("Сотрудники отдела ").append(name).append(":\n");
            for (Employee employee : employees) {
                String role = (employee == owner) ? " (начальник)" : "";
                result.append("- ").append(employee.getName()).append(role).append("\n");
            }
        }
        return result.toString();
    }
}
