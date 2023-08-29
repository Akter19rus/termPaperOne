import java.util.Arrays;

public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private  int ID;
    private static int count = 1;

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.setID(count++);
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Сотрудник: " +
                "Ф.И.О - " + fullName + "\n" +
                "Отдел - " + department + "\n" +
                "Зарплата - " + salary + "\n" +
                "ID - " + ID + "\n" +
                "~~~~~~~~~~~~~~~~~";
    }

    public static void fullEmployees(Employee[] employees) {
        for (Employee i : employees) {
            if (employees != null) {
                System.out.println(i);

            }
        }
    }

    public static void delimiter() {
        System.out.println("~~~~~~~~~~~~~~~~~");
    }

    public static double empTotalSalary(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static double averageSalary(Employee[] employees) {
        return empTotalSalary(employees) / employees.length;
    }

    public static Employee empMaxSalary(Employee[] employees) {
        Employee maxSalary = null;
        for (Employee i : employees) {
            if (maxSalary == null || i.getSalary() > maxSalary.getSalary()) {
                maxSalary = i;
            }
        }
        return maxSalary;
    }

    public static Employee empMinSalary(Employee[] employees) {
        Employee minSalary = null;
        for (Employee i : employees) {
            if (minSalary == null || i.getSalary() < minSalary.getSalary()) {
                minSalary = i;
            }
        }
        return minSalary;
    }

    public static void empList(Employee[] employees) {
        for (Employee i : employees) {
            System.out.println(i.getFullName());
        }
    }

    //Прошу прощения, все делал в мастер ветке, только сейчас заметил:(
}
