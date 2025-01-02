package Inheritance;

class HrManager extends Employee {
    public HrManager(double salary) {
        super(salary);
    }

    public void work() {
        System.out.println("HR Manager is managing human resources.");
    }

    public void addEmployee(String employeeName) {
        System.out.println("HR Manager is adding employee: " + employeeName);
    }
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee employee = new Employee(50000);
        employee.work();  // Employee work method
        System.out.println("Employee's salary: $" + employee.getSalary());

        HrManager hrManager = new HrManager(80000);
        hrManager.work();
        System.out.println("HR Manager's salary: $" + hrManager.getSalary());

        hrManager.addEmployee("John Doe");
    }
}

