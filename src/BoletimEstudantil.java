public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = Integer.parseInt(args[0]);
        if (mediaFinal < 6) {
            System.out.println("Reprovado");
        } else if (mediaFinal == 6) {
            System.out.println("Prova Minerva");
        } else {
            System.out.println("Aprovado");
        }
    }
}
