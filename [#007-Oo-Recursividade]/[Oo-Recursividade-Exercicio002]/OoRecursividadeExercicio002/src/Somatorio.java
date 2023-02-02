public class Somatorio {

    public static int calcularSomatorioRecursivo(int elemento) {
        if (elemento == 1) {
            return 1;
        } else {
            return (elemento + (calcularSomatorioRecursivo(elemento-1)));
        }
    }

}
