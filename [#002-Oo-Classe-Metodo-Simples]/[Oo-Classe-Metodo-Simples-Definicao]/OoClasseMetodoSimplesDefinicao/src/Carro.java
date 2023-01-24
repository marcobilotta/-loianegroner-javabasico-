public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double autonomia;

    void exibirAutonomia() {
        System.out.println("A kilometragem percorrida com um tanque de combustível é: " + (capCombustivel/autonomia) + " Km");
    }
}
