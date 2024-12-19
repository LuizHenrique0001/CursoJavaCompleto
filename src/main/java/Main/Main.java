package Main;

import org.w3c.dom.ranges.Range;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha Qual Exercicio Voce Deseja Ver:");
        System.out.println("1- rograma para ler um número inteiro, e depois dizer se este número é negativo ou não!");
        System.out.println("2- programa para ler um número inteiro e dizer se este número é par ou ímpar");
        System.out.println("3- 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem Sao Multiplos ou Nao sao Multiplos");

        int n = sc.nextInt();
        if (n==1)
        {
            System.out.print("Entre Com um Valor Interio:");
            double val = sc.nextDouble();

            if (val < 0) {
                System.out.println("Valor Negativo");
            }

            if (val >= 0) {
                System.out.println("Valor Nao Negativo");
            }
        }
        if(n==2)
        {

            System.out.print("Entre Com um Valor Interio:");
            double val = sc.nextDouble();

            if (val % 2 == 0)
            {
                System.out.println("Valor Par");
            }
            if (val % 2 != 0)
            {
                System.out.println("Valor Impar");
            }

        }
        if(n==3)
        {

            System.out.print("Entre Com um Valor Interio:");
            double val = sc.nextDouble();
            System.out.print("Entre Com Outro Valor Interio:");
            double val2 = sc.nextDouble();

            if (val % val2 == 0 || val2 % val == 0)
            {
                System.out.println("Sao Multiplos");
            }
            else
            {
                System.out.println("Nao Sao Multiplos");
            }

        }
    }
}