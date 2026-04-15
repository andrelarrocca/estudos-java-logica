import java.util.Scanner;

public class AnaliseNumeros {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int quantidade = quantidadeNumero();
        
        int[] cadastro = new int[quantidade];
        int soma = 0;
        int maiorNumero = 0;
        int menorNumero = 0;
        int par = 0;
        int impar = 0;

        for (int i = 0; i < cadastro.length; i++) {
            System.out.println("Digite um número inteiro: ");
            cadastro[i] = sc.nextInt();

            soma += cadastro[i];

            if(i == 0) {
                menorNumero = cadastro[i];
                maiorNumero = cadastro[i];
            } else {
                if (maiorNumero < cadastro[i]) {
                    maiorNumero = cadastro[i];
                }
                if (menorNumero > cadastro[i]) {
                    menorNumero = cadastro[i];
                }
            }

            if (cadastro[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        dados(cadastro);

        calculos(soma, maiorNumero, menorNumero, par, impar);

    }

    public static int quantidadeNumero() {

        System.out.println("Quantos números deseja guardar? ");
        int quantidade = sc.nextInt();
        return quantidade;
    }

    public static void dados(int[] cadastro) {

        System.out.println("\n--- DADOS INFORMADOS ---");

        for(int i = 0; i < cadastro.length; i++) {
            System.out.println((i + 1) + "°: " + cadastro[i]);
        }
    }

    public static void calculos(int soma, int maiorNumero, int menorNumero, int par, int impar) {

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Soma de todos os números: " + soma);
        System.out.println("Maior número: " + maiorNumero);
        System.out.println("Menor número: " + menorNumero);
        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);
    }
}