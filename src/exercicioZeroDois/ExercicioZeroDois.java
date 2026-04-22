package exercicioZeroDois;

import java.util.Scanner;

public class ExercicioZeroDois {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double valorSaque;
        int notas100 = 0, notas50 = 0, notas20 = 0, notas10 = 0, notas5 = 0, notas2 = 0, notas1 = 0;

        System.out.printf("Digite o valor para saque: R$");
        valorSaque = leitor.nextDouble();

        while (valorSaque != 0) {

            while (valorSaque >= 100) {
                valorSaque -= 100;
                notas100++;
            }
            while (valorSaque >= 50) {
                valorSaque -= 50;
                notas50++;
            }
            while (valorSaque >= 20) {
                valorSaque -= 20;
                notas20++;
            }
            while (valorSaque >= 10) {
                valorSaque -= 10;
                notas10++;
            }
            while (valorSaque >= 5) {
                valorSaque -= 5;
                notas5++;
            }
            while (valorSaque >= 2) {
                valorSaque -= 2;
                notas2++;
            }
            while (valorSaque >= 1) {
                valorSaque -= 1;
                notas1++;
            }
        }
        System.out.println("Notas de 100: " + notas100);
        System.out.println("Notas de 50: " + notas50);
        System.out.println("Notas de 20: " + notas20);
        System.out.println("Notas de 10: " + notas10);
        System.out.println("Notas de 5: " + notas5);
        System.out.println("Notas de 2: " + notas2);
        System.out.println("Notas de 1: " + notas1);
    }
}
