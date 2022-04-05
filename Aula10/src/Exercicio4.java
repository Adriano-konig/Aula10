import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Exercicio4 {
    public static void main(String[] args) {
        notas();
    }

public static void notas(){
    Scanner leitor = new Scanner(System.in);
    float soma = 0;
    float media = 0;
    float listaNota[] = new float[3];
    System.out.println("Digite seu nome: ");
    String nome = leitor.nextLine();
    System.out.println("Informe notas de "+nome);
    for(int i = 0;i < listaNota.length; i++){
        System.out.println("nota "+(i+1)+": ");
        listaNota[i] = leitor.nextFloat();
        soma = soma + listaNota[i];
        media = soma / 3;
    }
    System.out.println("média"+nome+"é: "+media);
}
}
