import java.util.Scanner;

public class ContaBancaria {
    private String nomeCompleto;
    private String agencia;
    private String conta;
    private String tipoConta;

    private Double saldo;

    private Double limite;

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public String getConta() {
        return this.conta;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public Double getLimite() {
        return this.limite;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setAgencia (String agencia) {
        this.agencia = agencia;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public void checarDadosCliente() {
        System.out.println("AGÊNCIA: ");
        Scanner menuTerminal = new Scanner(System.in);
        this.agencia = menuTerminal.nextLine();
        System.out.println("CONTA: ");
        this.conta = menuTerminal.nextLine();
    }

    public void verificarTipoCorrentista() {
        this.checarDadosCliente();
        this.nomeCompleto = "JOÃO ALVES DA SILVA";
        this.saldo = 6.300;
        if (saldo < 5.000) {
            this.tipoConta = "EXCLUSIVE";
            System.out.println(nomeCompleto + " sua conta atualmente é " + this.tipoConta);
        } else {
            this.tipoConta = "PRIME";
            System.out.println(nomeCompleto + " sua conta atualmente é " + this.tipoConta);
        }
    }

    public void verificarSaldo() {
        this.saldo = 4.500;
        this.nomeCompleto = "JOÃO ALVES DA SILVA";
        System.out.println(nomeCompleto + " seu saldo bancário é de " + this.saldo);
    }

    public void verificarLimite() {
        this.limite = 2.500;
        this.nomeCompleto = "JOÃO ALVES DA SILVA";
        System.out.println(nomeCompleto + " seu limite disponível é de " + this.limite);
    }
}
