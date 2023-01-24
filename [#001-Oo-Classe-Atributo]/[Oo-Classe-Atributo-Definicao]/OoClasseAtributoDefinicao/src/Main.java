/*
Java Fundamentos
Orientação a Objetos - Classe e Atributo

Definição e Exemplo de Classe e Atributo.
https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html
*/

public class Main {
    public static void main(String[] args) {
        Carro carroEstoque = new Carro();
        carroEstoque.marca = "FIAT";
        carroEstoque.modelo = "DUCATO";
        carroEstoque.numPassageiros = 10;
        carroEstoque.capCombustivel = 100;
        carroEstoque.autonomia = 10.7;

        Carro carroAntigo = new Carro();
        carroAntigo.marca = "VOLKSWAGEN";
        carroAntigo.modelo = "FUSCA";
        carroAntigo.numPassageiros = 4;
        carroAntigo.capCombustivel = 50;
        carroAntigo.autonomia = 6.9;

        System.out.println("=============================================");
        System.out.println("====== DESCRICAO VEICULO EM ESTOQUE =========");
        System.out.println("=============================================");
        System.out.println("= VEICULO:" + carroEstoque.modelo);
        System.out.println("= MARCA:" + carroEstoque.marca);
        System.out.println("= NÚMERO DE PASSAGEIROS:" + carroEstoque.numPassageiros);
        System.out.println("= CAPACIDADE TANQUE DE COMBUSTÍVEL:" + carroEstoque.capCombustivel);
        System.out.println("= AUTONOMIA:" + carroEstoque.autonomia + "\n");
        System.out.println(         "==== Quebra de Página ====\n");
        System.out.println("=============================================");
        System.out.println("====== DESCRICAO VEICULO EM ESTOQUE =========");
        System.out.println("=============================================");
        System.out.println("= VEICULO:" + carroAntigo.modelo);
        System.out.println("= MARCA:" + carroAntigo.marca);
        System.out.println("= NÚMERO DE PASSAGEIROS:" + carroAntigo.numPassageiros);
        System.out.println("= CAPACIDADE TANQUE DE COMBUSTÍVEL:" + carroAntigo.capCombustivel);
        System.out.println("= AUTONOMIA:" + carroAntigo.autonomia + "\n");



    }
}