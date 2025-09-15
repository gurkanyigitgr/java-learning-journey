package oop;

public class EmpDriver {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Gürkan",2000.0 , 45, 1985);

        System.out.println("Tax: " + emp1.tax());
        System.out.println("Bonus: " + emp1.bonus());
        System.out.println("Raised of Salary: " + emp1.raiseSalary());
        double totalSalary = emp1.salary + (emp1.bonus() - emp1.tax());
        System.out.println("Total Salary with tax and bonus: " + totalSalary);

        double totalSalaryWithRaisedSalary = emp1.salary + (emp1.bonus() - emp1.tax()) + emp1.raiseSalary();
        System.out.println("Total Salary with raised salary: " + totalSalaryWithRaisedSalary);
    }
}
