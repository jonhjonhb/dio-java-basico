public class App {
    public static void main(String[] args) throws Exception {
        
        String nomeCompleto = soma("Johnatan", "Augusto");
        System.out.println("Meu nome completo é: " + nomeCompleto);
        
        int resultadoSoma = soma(2, 3);
        System.out.println("O resultado da soma é: " + resultadoSoma);
    }

    public static int soma(int a, int b){
        return a + b;
    }
    public static String soma(String a, String b){
        return a.concat(" " + b);
    }
}
