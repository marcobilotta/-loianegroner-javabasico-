/*
Java Fundamentos
Orientação a Objetos - Classe e Atributos

Exercício 001
Escreva uma classe para representar uma lâmpada que está a venda no supermercado
*/

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.marca = "FIAT LUX";
        lampada.tipo = "FLUORESCENTE";
        lampada.voltagem = "110v";
        lampada.watts = "20w";
        lampada.temperatura = "1500K";
        lampada.vidaUtil = 50.000;

        System.out.println("=================================================");
        System.out.println("=========== CUPOM FISCAL CONSUMIDOR =============");
        System.out.println("=================================================");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("============ DESCRICAO DA LAMPADA ===============");
        System.out.println("MARCA:" + lampada.marca);
        System.out.println("TIPO:" + lampada.tipo);
        System.out.println("VOLTAGEM:" + lampada.voltagem);
        System.out.println("WATTS:" + lampada.watts);
        System.out.println("TEMPERATURA:" + lampada.temperatura);
        System.out.println("VIDA ÚTIL:" + lampada.vidaUtil + " Horas");
    }
}