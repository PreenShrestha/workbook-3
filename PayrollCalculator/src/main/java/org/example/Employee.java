package org.example;
;

public class Employee {
    private int employeeId;
    private String name;
    private double hoursWork;
    private double payRate;

    public Employee(int employeeId, String name, double hoursWork, double payRate)
    {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWork = hoursWork;
        this.payRate = payRate;
    }
    //employeeId

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWork() {
        return hoursWork;
    }

    public void setHoursWork(double hoursWork) {
        this.hoursWork = hoursWork;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public double getGrossPay()
    {
        return this.hoursWork * this.payRate;
    }
}
