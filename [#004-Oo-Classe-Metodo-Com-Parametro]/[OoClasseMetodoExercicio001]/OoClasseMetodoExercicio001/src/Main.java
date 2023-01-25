/*
Java Fundamentos
Orientação a Objetos - Classe e Método

Exercício 001
Escreva uma classe para representar uma lâmpada. Desenvolva métodos para ligar e desligar a lâmpada.
 */

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.marca = "FIAT LUX";
        lampada.modelo = "FLUORESCENTE";
        lampada.voltagem = "110v";
        lampada.watts = "20W";

        System.out.println("===============================================");
        System.out.println("============ SISTEMA DE AUTOMAÇÃO =============");
        System.out.println("====== CONTROLE DE LÂMPADAS RESIDENCIAIS ======");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("INFORMAÇÕES DA LÂMPADA");
        System.out.println("MARCA: " + lampada.marca);
        System.out.println("MODELO: " + lampada.modelo);
        System.out.println("VOLTAGEM: " + lampada.voltagem);
        System.out.println("WATTS: " + lampada.watts + "\n");
        System.out.println("-----------------------------------------------" + "\n");
        System.out.println("ESTADO DA LÂMPADA");
        lampada.verificarInterruptor(false);
    }
}