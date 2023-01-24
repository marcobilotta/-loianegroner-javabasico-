public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double autonomia;
    double valorCombustivel;

    double obterValorTanqueCheio() {
        return (capCombustivel/autonomia) * valorCombustivel;
    }
}