package org.java26.week6.monday.ex.inteface.ex2;

public class Employee implements Payable {
    double monthlySalary;

    public Employee(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculatePayment() {
        System.out.println(monthlySalary);
    }


}
