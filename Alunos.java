import java.util.Scanner;

public class Alunos {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int quantidade = quantidadeAlunos();

        String[] nome = new String[quantidade];
        double[] nota = new double[quantidade];

        double maiorNota = 0;
        double menorNota = 0;
        double soma = 0;
        int indiceMaior = 0;
        int indiceMenor = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "°  aluno: ");
            nome[i] = sc.nextLine();
            System.out.println("Digite a nota: ");
            nota[i] = sc.nextDouble();
            sc.nextLine();

            soma += nota[i];
            
            if(i == 0){
                maiorNota = nota[i];
                menorNota = nota[i];
                indiceMaior = i;
                indiceMenor = i;
            } else {
                if(nota[i] > maiorNota){
                    maiorNota = nota[i];
                    indiceMaior = i;
                }
                if(nota[i] < menorNota) {
                    menorNota = nota[i];
                    indiceMenor = i;
                }   
            }
        }
    
        exibirAlunos(nome, nota);

        resultado(quantidade, nome, nota, maiorNota, menorNota, soma, indiceMaior, indiceMenor);

    }

    public static int quantidadeAlunos() {

        System.out.println("Quantos alunos serão cadastrados? ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        return quantidade;
    }

    public static void exibirAlunos(String[] nome, double[] nota) {

        System.out.println("\n--- DADOS DOS ALUNOS ---");
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Aluno: " + nome[i] + " - Nota: " + nota[i]);
        }
    }
    
    public static void resultado(int quantidade, String[] nome, double[] nota, double maiorNota, double menorNota, double soma, int indiceMaior, int indiceMenor) {

         System.out.println();
         System.out.printf("Média da turma: %.2f\n", (soma / quantidade));
         System.out.println("Maior nota: " + nome[indiceMaior] + " - " + maiorNota);
         System.out.println("Menor nota: " + nome[indiceMenor] + " - " + menorNota);
    }
}