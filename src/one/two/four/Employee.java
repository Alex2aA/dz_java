package one.two.four;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name) {
        this.name = name != null ? name : "Неизвестный сотрудник";
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        if (this.department != null) {
            this.department.removeEmployee(this);
        }
        this.department = department;
        if (department != null) {
            department.addEmployee(this);
        }
    }

    @Override
    public String toString() {
        if (name == null) return "Не задано имя сотрудника";
        if (department == null) return name + " без отдела";
        if (this == department.getOwner()) {
            return name + " начальник отдела " + department.getName();
        }
        String ownerName = (department.getOwner() != null && department.getOwner().getName() != null)
                ? department.getOwner().getName() : "не назначен";
        return name + " работает в " + department.getName() + ". Начальник: " + ownerName;
    }
}
