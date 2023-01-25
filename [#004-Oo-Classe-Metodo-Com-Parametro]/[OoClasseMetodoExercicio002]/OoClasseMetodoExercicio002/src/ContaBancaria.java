import java.util.Scanner;

public class ContaBancaria {
    String tipoDeConta;
    int agencia;
    int digitoAgencia;
    String numeroDaConta;
    int digitoDaConta;
    String status;
    String correntista;
    double limite;
    double saldo;
    double valorSaque;
    double verificarSaldo;
    double valorDeposito;

    void sacar() {
        System.out.println("DIGITE O VALOR PARA SAQUE:");
        Scanner lerSaque = new Scanner(System.in);
        valorSaque = lerSaque.nextDouble();
        verificarSaldo = saldo-valorSaque;
            if (verificarSaldo < limite) {
                System.out.println("SALDO INSUFICIENTE!");
            } else {
                System.out.println("SAQUE REALIZADO COM SUCESSO!");
                System.out.println("SEU SALDO É DE: " + verificarSaldo);
            }
    }
    void depositar() {
        System.out.println("DIGITE O VALOR A SER DEPOSITADO:");
        Scanner lerDeposito = new Scanner(System.in);
        valorDeposito = lerDeposito.nextDouble();
        System.out.println("DEPOSITO REALIZADO COM SUCESSO!");
        System.out.println("SEU SALDO É DE: " + (saldo + valorDeposito));
    }
}
