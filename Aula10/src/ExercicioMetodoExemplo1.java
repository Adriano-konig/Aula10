import java.util.Scanner;

public class ExercicioMetodoExemplo1 {
    public static void main(String[] args) {
        somaNumerosDigitado();
    }
    public static void somaNumerosDigitado(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos numeros gostaria fazer soma: ");
        int numeros = leitor.nextInt();
        int soma=0;

        int listaNumero[] = new int[numeros]; 

        for(int i = 0;i < listaNumero.length;i++ ){
            System.out.println("numero "+i+":");
            listaNumero[i] = leitor.nextInt();  
        }
        for(int i = 0;i < listaNumero.length;i++){
        soma = soma + listaNumero[i];
        System.out.println("Lista numeros"+i+": "+listaNumero[i]);
        }
       System.out.println("Resultado é: "+soma);
       
       }
   
       
}
