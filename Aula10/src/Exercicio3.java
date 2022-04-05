import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        vendedor();
    }
    public static void vendedor(){
        Scanner leitor = new Scanner(System.in);
        double aumentoSalario;

        System.out.println("Informe seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Informe seu salário: ");
        double salarioFixo = leitor.nextDouble();

        aumentoSalario = salarioFixo * 0.15;



        System.out.println("Nome Vendedor: "+nome);
        System.out.println("Salario Fixo: "+salarioFixo);
        System.out.println("Ganho 15% de comissão: "+aumentoSalario);

    }
    
}
