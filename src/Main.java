public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        // ВНИМАНИЕ! ЛЮБЫЕ СОВПАДЕНИЯ СЛУЧАЙНЫ
        employees[0] = new Employee("Силантьев Владислав Аркадьевич", 2, 85_000);
        employees[1] = new Employee("Иванов Иван Иванович", 1, 125_500);
        employees[2] = new Employee("Степанов Степан Степанович", 1, 99_000);
        employees[3] = new Employee("Малинина Марина Викторовна", 3, 75_500);
        employees[4] = new Employee("Калинин Кирилл Анатольевич", 3, 74_000);
        employees[5] = new Employee("Имя Фамилия Отчествовна", 2, 84_000);
        employees[6] = new Employee("Такой Та Такой", 5, 20_000);
        employees[7] = new Employee("Человек Прямоходящий Двуногий", 4, 30_000);
        employees[8] = new Employee("Программист Разработчик Джавист", 4, 32_000);
        employees[9] = new Employee("Моисеев Моисей Моисеевич", 5, 19_000);

            Employee.fullEmployees(employees);
            Employee.empTotalSalary(employees);

        System.out.println("Общая сумма трат на заработную плату - " + Employee.empTotalSalary(employees) + "руб");
        Employee.delimiter();
        System.out.println("Среднее значение зарплат - " + Employee.averageSalary(employees) + "руб");
        Employee.delimiter();
        System.out.println("Сотрудник с максимальной зарплатой - " + Employee.empMaxSalary(employees));
        System.out.println("Сотрудник с наименьшей зарплатой - " + Employee.empMinSalary(employees));

            Employee.empList(employees);
        }
    }
