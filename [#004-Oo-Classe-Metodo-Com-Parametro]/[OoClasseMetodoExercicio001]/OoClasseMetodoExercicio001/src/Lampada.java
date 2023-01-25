public class Lampada {
    String marca;
    String modelo;
    String voltagem;
    String watts;
    boolean interruptor;

    void verificarInterruptor(boolean interruptor) {
        if (interruptor == true) {
            System.out.println("O INTERRUPTOR ESTÁ LIGADO!");
            System.out.println("___ ___ ___");
        } else {
            System.out.println("O INTERRUPTOR ESTÁ DESLIGADO!");
            System.out.println("___ |  ___");
        }
    }
}
