public class EmployeeImpl {
    public static void main(String[] args) {
        Employee obj = new Employee("Daniel",132,34,"12/12/1990","124,Bridge,water,evile road",3000.0);

        double annualSalary = obj.calculateAnnualSalary();
        System.out.println("Annual salary "+annualSalary);
        System.out.println("Monthly salary before pay rise "+obj.salary);
        obj.salary = obj.calculatePayRise(20);
        System.out.println("Monthly salary after pay rise "+ obj.salary);

    }
}