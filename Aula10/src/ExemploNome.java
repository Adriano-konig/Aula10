import java.util.Scanner;

public class ExemploNome {

    public static void main(String[] args) {
        mensagemBoasVindas();
    }

    public static void mensagemBoasVindas(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nomeDigitado = leitor.nextLine();

        System.out.println("Digite o sobrenome");
        String sobrenomeDigitado = leitor.nextLine();

        System.out.println("Olá "+nomeDigitado+" "+sobrenomeDigitado);
    }
}