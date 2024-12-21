package Main;

import Entities.Rectangle;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter Rectangle Width and Height:");
        rectangle.Width = sc.nextInt();
        rectangle.Height = sc.nextInt();
        System.out.print(rectangle);

        sc.close();
    }
}