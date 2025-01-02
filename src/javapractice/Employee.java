package javapractice;

import java.text.DecimalFormat;

public class Employee {
    private int employeeId=15;
    private String employeeName="abhi";
    private int employeeSalary=20000;

    public int getEmployeeId() {
        return employeeId;
    }

    public int setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public boolean setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return false;
    }

    public String getEmployeeSalary() {
        DecimalFormat df = new DecimalFormat("$###,###.00");  // Format salary as currency
        return df.format(employeeSalary);
        }

    public void setEmployeeSalary(int empployeeSalary) {
        this.employeeSalary = empployeeSalary;
    }

    public static void main(String[] args) {
        Employee e=new Employee();
        e.setEmployeeId(123);
        e.setEmployeeName("avinash");
        e.setEmployeeSalary(10000);
        System.out.println(e.employeeId);
        System.out.println(e.employeeName);
        System.out.println(e.employeeSalary);
    }
}

