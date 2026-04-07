import java.util.Scanner;

public class Login {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String novoUsuario = cadastroUsuario();
        String novaSenha = cadastroSenha();
        int tentativas = 0;
        confirmacaoLogin(novoUsuario, novaSenha, tentativas);
    }

    public static String cadastroUsuario() {

        System.out.println("CADASTRO:");
        System.out.println("Novo usuário: ");
        String novoUsuario = sc.nextLine();
        return novoUsuario;
    }

    public static String cadastroSenha() {

        System.out.println("Nova senha: ");
        String novaSenha = sc.nextLine();
        return novaSenha;
    }

    public static void confirmacaoLogin(String novoUsuario, String novaSenha, int tentativas) {

        do {

            System.out.println("LOGIN:");
            System.out.println("Usuário: ");
            String usuario = sc.nextLine();
            System.out.println("Senha: ");
            String senha = sc.nextLine();

            boolean loginConfirmado = novoUsuario.equals(usuario);
            boolean senhaConfirmada = novaSenha.equals(senha);

            if (loginConfirmado && senhaConfirmada) {
                System.out.println("Acesso liberado.");
                break;
            }

            if (!loginConfirmado) {
                System.out.println("Usuário incorreto.");
            }

            if (!senhaConfirmada) {
                System.out.println("Senha incorreta.");
            }

            tentativas++;

            if (tentativas >= 3) {
                System.out.println("Conta bloqueada.");
            }

        } while (tentativas < 3);
    }
}
