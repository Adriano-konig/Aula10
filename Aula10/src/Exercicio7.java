import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        vendaProduto();
    }
    public static void vendaProduto(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor de produto: ");
        double valor = leitor.nextDouble();

        double acrescimo = valor * 0.1;
        double total = valor + acrescimo;

        System.out.println("O produto venda deu "+acrescimo+" acrescimo um porcentual o valor ficou em: "+total);
    }
    
}
