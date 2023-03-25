public class App {
    public static void main(String[] args) throws Exception {
        
        String nomeCompleto = somar("Johnatan", "Augusto");
        imprimir("Meu nome completo é: " + nomeCompleto);
        
        int resultadoSoma = somar(2, 3);
        imprimir("O resultado da soma é: " + resultadoSoma);
    }

    public static int somar(int a, int b){
        return a + b;
    }
    
    public static String somar(String a, String b){
        return a.concat(" " + b);
    }

    public static void imprimir(String texto) {
        System.out.println(texto);
    }
}
