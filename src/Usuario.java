public class Usuario {
    public static void main(String[] args) {
        SmartTv tv = new SmartTv();
        
        tv.aumentarVolume();
        System.out.println("TV está Ligada ? " + tv.ligada);
        System.out.println("Canal Atual : " + tv.canal);
        System.out.println("Volume Atual : " + tv.volume);

        tv.ligar();
        System.out.println("Novo Status -> TV está Ligada ? " + tv.ligada);

        tv.aumentarVolume();
        tv.diminuirVolume();

        tv.desligar();
        System.out.println("Novo Status -> TV está Ligada ? " + tv.ligada);
    }
}
