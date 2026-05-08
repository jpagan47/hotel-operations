package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double totalPay;
    private int timeIn;
    private int timeOut;
    public int getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(int timeIn) {
        this.timeIn = timeIn;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
    public Employee(){

    }

    public int punchIn(int timeIn){
        if (timeIn < 0 || timeIn >24){
            System.out.println("Invalid Time Input");
            return 0;
        }
        return this.timeIn = timeIn;
    }
    public int punchOut(int timeOut){
        if(timeOut < 0 || timeOut > 24){
            System.out.println("Invalid Time Input");
            return 0;
        }
        return this.timeOut= timeOut;

    }
    public double getTotalPay(){
        totalPay = hoursWorked * payRate;
        return totalPay;
    }

    public double getRegularHours(){
        if(hoursWorked<=40){
            return hoursWorked;

        }
        return 40;
    }
    public double getOvertimeHours(){
        if(hoursWorked>40){
            hoursWorked = hoursWorked - 40;
            return hoursWorked;
        }
        return 0;
    }
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


}
