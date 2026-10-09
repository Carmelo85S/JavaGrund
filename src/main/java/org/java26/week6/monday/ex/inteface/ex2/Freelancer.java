package org.java26.week6.monday.ex.inteface.ex2;

public class Freelancer implements Payable {
    //hourlyRate and hoursWorked
    double hourlyRate;
    double hoursWorked;

    public Freelancer(double hourlyRate, double hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculatePayment() {
        System.out.println(hourlyRate * hoursWorked);

    }
}
