package Main;

import Entities.Employee;


import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Name:");
        emp.Name = sc.nextLine();
        System.out.print("Gross Salary:");
        emp.GrossSalary = sc.nextDouble();
         System.out.print("Tax:");
        emp.Tax = sc.nextDouble();

        System.out.println("Employee:"+ emp);

        System.out.print("Which percentage to increase salary?:");
        double percentage = sc.nextDouble();

        emp.IncreaseSalary(percentage);

        System.out.print("Updated data:"+ emp);


        sc.close();
    }
}