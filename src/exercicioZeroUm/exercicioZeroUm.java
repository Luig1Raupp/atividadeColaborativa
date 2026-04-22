package exercicioZeroUm;

import java.util.Scanner;

    public class exercicioZeroUm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double num1, num2, resultado;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();

                switch (opcao) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("Resultado da Soma: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("Resultado da Subtração: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado da Multiplicação: " + resultado);
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("Resultado da Divisão: " + resultado);
                        } else {
                            System.out.println("Erro: Não é possível dividir por zero!");
                        }
                        break;
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        System.out.println("Programa encerrado. Até logo!");
        scanner.close();
    }
  }
 