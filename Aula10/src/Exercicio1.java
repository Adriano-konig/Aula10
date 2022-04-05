import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Calculador();
    }
    public static void Calculador(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = leitor.nextInt();
        System.out.println("Digite um numero: ");
        int num2 = leitor.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;


        System.out.println("Resultado operações dois numeros foi digitado: "+num1+" e "+num2);
        System.out.println("Operação soma: "+soma);
        System.out.println("Operação subtracao: "+subtracao);
        System.out.println("Operação multiplicacao: "+multiplicacao);
        System.out.println("Operação divisao: "+divisao);
                                                   
    }
}
