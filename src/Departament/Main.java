package Departament;

public class Main {
    public static void main(String[] args) {
        Employee ivan = new Employee("Иван");
        Employee petr = new Employee("Петр");
        Employee maria = new Employee("Мария");

        Department itDepartment = new Department("IT отдел");

        itDepartment.setOwner(ivan);

        itDepartment.addEmployee(petr);
        itDepartment.addEmployee(maria);

        System.out.println(itDepartment);
        System.out.println();
        System.out.println(itDepartment.getAllEmployees());
        System.out.println();
        System.out.println(ivan);
        System.out.println(petr);
        System.out.println(maria);
    }
}
