public class App {
    public static void main(String[] args) {
        metodoSemRetornoParameto();
        exibeNomeUsuario("Adriano");
        multiplicacao(2,2);

    }
    //Método sem retorno e sem parametro
    public static void metodoSemRetornoParameto(){
        System.out.println("Primeiro metodo");
    }
    //Método sem retorno e com parametro
    public static void exibeNomeUsuario(String nomeUsuario){
        System.out.println("nome usuario: "+nomeUsuario);
    }

    //Método com restorno e sem parametro
    public static int somatorio(){
        int resultado = 2 + 4;
        System.out.println(resultado);
        return resultado;
    }

    //Método com retorno e com parametro
    public static int multiplicacao(int numeroA, int numeroB) {
        int resultado1 = numeroA * numeroB;
        System.out.println(resultado1);
        return resultado1;
    }
    
}
