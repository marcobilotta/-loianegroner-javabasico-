/*
Java Fundamentos
Orientação a Objetos - Classe e Atributo

Definição de Classe com Retorno.
 */

public class Main {
    public static void main(String[] args) {
        Carro carroEstoque = new Carro();
        carroEstoque.marca = "FIAT";
        carroEstoque.modelo = "DUCATO";
        carroEstoque.numPassageiros = 10;
        carroEstoque.capCombustivel = 100;
        carroEstoque.autonomia = 10.7;
        carroEstoque.valorCombustivel = 5.04;

        Carro carroAntigo = new Carro();
        carroAntigo.marca = "VOLKSWAGEN";
        carroAntigo.modelo = "FUSCA";
        carroAntigo.numPassageiros = 4;
        carroAntigo.capCombustivel = 50;
        carroAntigo.autonomia = 6.9;
        carroAntigo.valorCombustivel = 5.04;

        System.out.println("=============================================");
        System.out.println("====== DESCRICAO VEICULO EM ESTOQUE =========");
        System.out.println("=============================================");
        System.out.println("= VEICULO:" + carroEstoque.modelo);
        System.out.println("= MARCA:" + carroEstoque.marca);
        System.out.println("= NÚMERO DE PASSAGEIROS:" + carroEstoque.numPassageiros);
        System.out.println("= CAPACIDADE TANQUE DE COMBUSTÍVEL:" + carroEstoque.capCombustivel);
        System.out.println("= AUTONOMIA:" + carroEstoque.autonomia + "\n");
        System.out.println("A MEDIA EM REAIS PARA COMPLETAR O TANQUE DO VEÍCULO É DE: " + carroEstoque.obterValorTanqueCheio() + "\n");
        System.out.println(         "==== Quebra de Página ====\n");
        System.out.println("=============================================");
        System.out.println("====== DESCRICAO VEICULO EM ESTOQUE =========");
        System.out.println("=============================================");
        System.out.println("= VEICULO:" + carroAntigo.modelo);
        System.out.println("= MARCA:" + carroAntigo.marca);
        System.out.println("= NÚMERO DE PASSAGEIROS:" + carroAntigo.numPassageiros);
        System.out.println("= CAPACIDADE TANQUE DE COMBUSTÍVEL:" + carroAntigo.capCombustivel + " Litros");
        System.out.println("= AUTONOMIA:" + carroAntigo.autonomia + " Km/L" + "\n");
        System.out.println("A MEDIA EM REAIS PARA COMPLETAR O TANQUE DO VEÍCULO É DE: " + carroAntigo.obterValorTanqueCheio());
    }
}