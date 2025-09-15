package oop;

public class Employee {
     String name;
     double salary;
     int workHours, hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if(this.salary > 1000) {
            return this.salary * 0.03;
        }
        return 0.0;
    }

    public double bonus(){
        int extraWorkHours = this.workHours - 40;
        if(extraWorkHours > 0) {
            return extraWorkHours * 30;
        }
            return 0.0;
    }

    public double raiseSalary(){
        int year = 1990 - this.hireYear;
        if(year < 10) {
            return this.salary * 0.05;
        } else if(year > 10 && year <20) {
            return this.salary * 0.10;
        } else {
        return this.salary * 0.15;
        }
    }


}
