public class Employee {
    String employeeName;
    int employeeCode;
    int age;
    String dob;
    String address;
    double salary;
    Employee(String employeeName,int employeeCode,int age,String dob,String address,double salary){
        this.employeeName = employeeName;
        this.employeeCode = employeeCode;
        this.age = age;
        this.dob = dob;
        this.address = address;
        this.salary = salary;
    }
    public double calculateAnnualSalary(){
        return  salary * 12;

    }
    public double calculatePayRise(double hikePercentage){
        return salary + (hikePercentage     * salary)/100;
    }
}
