package org.java26.week6.monday.ex.inteface.ex2;

public class Main {
    public static void main(String[] args) {
        //Objective: Use an interface with a return value.
        //Define the following interface:
        //public interface Payable {
        //    double calculatePayment();
        //}
        //Create two classes:
        //- Employee, with a monthlySalary attribute.
        //- Freelancer, with hourlyRate and hoursWorked attributes.
        //Both classes must implement Payable.
        //Requirements:
        //- Employee returns the monthly salary.
        //- Freelancer returns hourlyRate * hoursWorked.
        //In the main method, calculate and print the payment for both objects.
        //Question: Why is it useful to declare a variable of type Payable instead of using Employee or Freelancer directly?

        Employee p1 = new Employee(2000);
        p1.calculatePayment();
        Freelancer p2 = new Freelancer(18.45,5);
        p2.calculatePayment();
    }
}
