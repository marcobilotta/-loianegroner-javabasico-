public class Contador {
    static int incremento;

    public int getIncremento() {
        return this.incremento;
    }

    public void setIncremento (int incremento) {
        this.incremento = incremento;
    }

    public Contador() {
        incremento++;
    }

    public static void zerarIncremento() {
        incremento = 0;
        System.out.println("VALOR DO INCREMENTO ZERADO!");
    }

    public static void incrementar() {
        incremento++;
        System.out.println("O ELEMENTO FOI INCREMENTADO!");
    }

    public static void retornarValorIncremento() {
        System.out.println("O VALOR DO INCREMENTO É " + incremento);
    }
}
