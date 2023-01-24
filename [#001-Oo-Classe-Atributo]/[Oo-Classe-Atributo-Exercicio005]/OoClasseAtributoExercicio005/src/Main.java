/*
Java Fundamentos
Orientação a Objetos - Classe e Atributo

Exercício 005
Criar uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se ela é especial ou não e um limite.
 */

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.agencia = 536;
        contaBancaria.digitoAgencia = 3;
        contaBancaria.numeroDaConta = "0066673";
        contaBancaria.digitoDaConta = 4;
        contaBancaria.tipoDeConta = "CONTA CORRENTE";
        contaBancaria.status = "ESPECIAL";
        contaBancaria.correntista = "JOSÉ LUIS DATENA";
        contaBancaria.saldo = 18750;
        contaBancaria.limite = 100000;

        System.out.println("==============================================");
        System.out.println("============== NUBANK - NUCONTA ==============");
        System.out.println("==============================================");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("AGÊNCIA: " + contaBancaria.agencia);
        System.out.println("DÍGITO DA AGÊNCIA: " + contaBancaria.digitoAgencia);
        System.out.println("NÚMERO DA CONTA: " + contaBancaria.numeroDaConta);
        System.out.println("DÍGITO DA CONTA: " + contaBancaria.digitoDaConta);
        System.out.println("TIPO DE CONTA: " + contaBancaria.tipoDeConta);
        System.out.println("STATUS: " + contaBancaria.status);
        System.out.println("CORRENTISTA: " + contaBancaria.correntista);
        System.out.println("SALDO BANCÁRIO: R$ " + contaBancaria.saldo);
        System.out.println("LIMITE DISPONÍVEL: R$ " + contaBancaria.limite);
    }
}