/*
Java Fundamentos
Orientação a Objetos - Classe e Método com Parâmetro e Retorno.

Exercício 002
Criar uma classe para representar uma conta bancária que possui um número, um saldo, um status que informa se ela é especial ou não,um limite.
Desenvolva métodos para realizar saque (verificando se o cliente pode realizar o saque) depositar dinheiro, consultar saldo e verificar se o
cliente está usando cheque especial ou não.
Desenvolva um programa para testar essa classe.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcaoMenu;

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.agencia = 536;
        contaBancaria.digitoAgencia = 3;
        contaBancaria.numeroDaConta = "0066673";
        contaBancaria.digitoDaConta = 4;
        contaBancaria.tipoDeConta = "CONTA CORRENTE";
        contaBancaria.status = "ESPECIAL";
        contaBancaria.correntista = "JOSÉ LUIS DATENA";
        contaBancaria.saldo = 2500;
        contaBancaria.limite = 1000;

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
        System.out.println("LIMITE DISPONÍVEL: R$ " + contaBancaria.limite + "\n");
        System.out.println("----------------------------------------------" + "\n");
        System.out.println("===============================================");
        System.out.println("============== OPERAÇÕES NUBANK ===============");
        System.out.println("-----------------------------------------------");
        System.out.println("DIGITE A OPÇÃO DESEJADA:");
        Scanner entradaMenu = new Scanner(System.in);
        opcaoMenu = entradaMenu.nextInt();
        switch (opcaoMenu) {
            case 1:
                contaBancaria.sacar();
                break;
            case 2:
                contaBancaria.depositar();
                break;
            case 3:
                contaBancaria.consultarSaldo();
                break;
            case 4:
                contaBancaria.verificarChequeEspecial();
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
                System.out.println("TENTE NOVAMENTE");
        }
    }
}