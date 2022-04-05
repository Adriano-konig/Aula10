import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        numeroMenor();

    }

    public static void numeroMenor(){
        Scanner leitor = new Scanner(System.in);
        int vetor[] = new int[7];
        int menor = vetor[0];
        int maior = vetor[0];

        

        System.out.println("Digite 7 numeros que desejar para nos analisar qual deles e menor");
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite numero "+(i+1)+":");
            vetor[i] = leitor.nextInt(); 

            if(i==0){
                maior = vetor[i];
                menor = vetor[i];
            }
            if(vetor[i] > maior){
                maior = vetor[i];
            }
            if(vetor[i] < menor){
                menor = vetor[i];
            }
        }
        System.out.println("numero menor é "+menor);
    }
}
