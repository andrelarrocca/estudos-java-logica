import java.util.Scanner;

public class Banco {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;
        double saldo = 1000;

        do {
            menu();
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n ", saldo);
                    break;

                case 2:
                    saldo = depositar(saldo);
                    break;

                case 3:
                    saldo = sacar(saldo);
                    break;

                case 4:
                    sair();
                    break;

                default:
                    System.out.println("Operação inválida.");
            }

        } while (opcao != 4);
        
    }

    public static void menu() {

        System.out.println("----------------------");
        System.out.println("--- OPERAÇÃO ---");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Depósito");
        System.out.println("3 - Saque");
        System.out.println("4 - Sair");
        System.out.println("----------------------");
    }

    public static double depositar(double saldo) {

        System.out.println("Valor do depósito: ");
        double deposito = sc.nextDouble();
        if (deposito > 0) {
        saldo += deposito;
            System.out.println("Depósito realizado.");
            System.out.printf("Saldo atual: R$ %.2f%n ", saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
        return saldo;
    }

    public static double sacar(double saldo) {

        System.out.println("Digite o valor do saque: ");
        double saque = sc.nextDouble();
        if (saque <= 0) {
            System.out.println("Valor inválido.");
        } else if (saque > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
        saldo -= saque;
            System.out.println("Saque realizado.");
            System.out.printf("Saldo atual: R$ %.2f%n ", saldo);
        }
        return saldo;
    }

    public static void sair() {

        System.out.println("Saindo...");
    }
}
