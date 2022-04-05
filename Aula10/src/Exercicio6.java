import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        ConvertidaRealParaDolar();
    }
    public static void ConvertidaRealParaDolar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos real você quer saber para conversão em dolar?: ");
        double real = leitor.nextFloat();

        double dolar = real * 0.217637;

        System.out.println("valor dolar é: "+dolar);
    }
}
