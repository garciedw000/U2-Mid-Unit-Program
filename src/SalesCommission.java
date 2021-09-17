/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38



 */

//1. get input - hourly rate = 5.25-->7.50, hours worked = 30 -->40, sales tax(commission) = 1-->3, cars sold = 10,000--->30,000.

//2a. calculate - hourly rate  * hours = salary
//2b. calculate - cars sold * car price but only output commissions = "bonuses".

//3. output - bonuses and salary.


import javax.swing.*;
import java.text.DecimalFormat;

public class SalesCommission {

    public static void main(String[] args) {

        double hourlyRate = getInput("What is your Hourly Rate (Between $5.25 to $7.50) ?");
        double hoursWorked = getInput("How many hours did you work (Between 30 to 40) ?");
        double commissionPercent = getInput("What is your commission?");
        double totalSales = getInput("How much did you sell in total?");


        double earnings =  commission(commissionPercent, totalSales) + salary(hourlyRate, hoursWorked);


        outputResults(earnings);

        System.exit(0);

    }



    public static double getInput(String message){

        return Double.parseDouble(JOptionPane.showInputDialog(message));

    }


    public static double salary(double hourlyRate, double hoursWorked){

        return hourlyRate * hoursWorked;

    }


    public static double commission(double commissionPercent, double totalSales){

        return totalSales * (commissionPercent/100);

    }



    public static void outputResults(double totalSales){

        DecimalFormat round = new DecimalFormat("0.00");

        JOptionPane.showMessageDialog(null, "You earned a total of: " + round.format(totalSales));


    }






}
