public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        aumentarVolume(1);
    }

    public void aumentarVolume(int valor) {
        volume += valor;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        diminuirVolume(1);
    }

    public void diminuirVolume(int valor) {
        volume -= valor;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Canal alterado para: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Canal alterado para: " + canal);
    }
}
