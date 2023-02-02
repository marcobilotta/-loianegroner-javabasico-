public class Fibonacci {
    public int calcularFibonacci(int elemento) {
        if (elemento == 0) {
            return 1;
        } else {
            return (elemento * calcularFibonacci(elemento-1));
        }
    }
}
