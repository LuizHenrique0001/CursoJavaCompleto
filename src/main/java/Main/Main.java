package Main;

import org.w3c.dom.ranges.Range;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha Qual Exercicio Voce Deseja Ver:");
        System.out.println("1- programa que repita a leitura de uma senha até que ela seja válida");
        System.out.println("2- Programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano");
        System.out.println("3- algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim)");

        int n = sc.nextInt();
        if (n==1)
        {
            System.out.print("Entre Com Uma Senha:");

            int senha = sc.nextInt();

            while(senha != 2007)
            {
                System.out.println("Senha incoreta");

                 senha = sc.nextInt();
            }
                System.out.print("Senha Correta");

        }
        if(n==2)
        {

            int x = sc.nextInt();
            int y = sc.nextInt();

            while (x != 0 && y != 0) {
                if (x > 0 && y > 0) {
                    System.out.println("primeiro");
                }
                else if (x < 0 && y > 0) {
                    System.out.println("segundo");
                }
                else if (x < 0 && y < 0) {
                    System.out.println("terceiro");
                }
                else {
                    System.out.println("quarto");
                }
                x = sc.nextInt();
                y = sc.nextInt();
            }

        }
        if(n==3)
        {

            System.out.println(" 1.Gasolina 2.Diesel 3.Etanol 4.Fim");
            int opcao = sc.nextInt();

            int gasolina = 0;
            int diesel = 0;
            int etanol = 0;

            while(opcao != 4)
            {
                System.out.println(" 1.Gasolina 2.Diesel 3.Etanol 4.Fim");
                gasolina = (opcao == 1) ? gasolina+1 : gasolina;
                diesel = (opcao == 2) ? diesel+1 : diesel;
                etanol = (opcao == 3) ? etanol+1 : etanol;

                if(opcao <=0 || opcao >4)
                {
                    System.out.println(" Valor Invalido");
                }

                opcao = sc.nextInt();

            }

            System.out.println("OBRIGADO");

            System.out.println("Gasolina:"+gasolina);
            System.out.println("Diesel:"+diesel);
            System.out.println("Etanol:"+etanol);

        }
    }
}