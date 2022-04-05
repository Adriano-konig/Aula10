import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        temperaturaConvertida();
    }

    public static void temperaturaConvertida(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a temperatura °c : ");
        float celsius = leitor.nextFloat();

        float fah = (9 * celsius) + 160;
        float resultadoTemperaturaConvertida = fah / 5;
        
        System.out.println("A temperatura celsius "+celsius+"c° convertido para a temperatura Fahrenheit é: "+resultadoTemperaturaConvertida+"F°");
    }
}
