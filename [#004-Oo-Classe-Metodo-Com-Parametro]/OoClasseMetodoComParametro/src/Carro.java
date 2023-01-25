public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double autonomia;
    double valorCombustivel;
    double litragemCombustivel;

    double calcularCombustivel (double km) {
        return litragemCombustivel = km/autonomia;
    }
}
