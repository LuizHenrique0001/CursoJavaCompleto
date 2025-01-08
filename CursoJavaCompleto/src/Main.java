
import Entities.Emplyoee;

import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Emplyoee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int value = sc.nextInt();

        for (int i=1; i<=value; i++)
        {
            System.out.println("Emplyoee #"+ i +":");

            System.out.print("Id: ");
            sc.nextLine();
            int idEmplyoee = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String nameEmplyoee = sc.nextLine();

            System.out.print("Salary: ");
            double salaryEmplyoee = sc.nextDouble();

            list.add(new Emplyoee(idEmplyoee, nameEmplyoee, salaryEmplyoee));

        }

        System.out.print("Enter the employee id that will have salary increase :");
        int idEmployee = sc.nextInt();

        Emplyoee em = list.stream().filter(x -> x.getId() == idEmployee).findFirst().orElse(null);

        if (em == null)
        {
            System.out.println("This id does not exist!");
        }else
        {

            System.out.print("Enter the percentage:");
            double percentage = sc.nextDouble();

            em.salaryIncrease(percentage);

        }

        System.out.println("List of employees:");

        System.out.println(list);

        sc.close();

    }

}