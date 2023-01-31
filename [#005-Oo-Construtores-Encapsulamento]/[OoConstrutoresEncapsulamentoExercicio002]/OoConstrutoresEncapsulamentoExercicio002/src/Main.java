/*
Java Fundamentos
Orientação a Objetos - Construtores e Encapsulamento

Exercício002
Criar uma classe para representar uma conta corrente que possui um número, um saldo, um status que informa se ela é especial ou não, um limite.
Desenvolva métodos para realizar saque (verificando se o cliente pode realizar saques), depositar dinheiro, consultar saldo e verificar se o cliente está
usando o cheque especial ou não.
Desenvolva um programa para testar essa classe.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;

        ContaBancaria contaBancaria = new ContaBancaria();
        System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println("|                       TERMINAL BANCÁRIO - BANCO BRADESCO                              |");
        System.out.println("|                         BRÁ DE BRADESCO - DIA E NOITE                                 |");
        System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.println("DIGITE A OPÇÃO DESEJADA:");
        System.out.println("1- TIPO DE CORRENTISTA");
        System.out.println("2- SALDO BANCÁRIO");
        System.out.println("3- LIMITE DISPONÍVEL");
        Scanner menu = new Scanner(System.in);
        opcao = menu.nextInt();
        switch (opcao) {
            case 1:
                contaBancaria.verificarTipoCorrentista();
                break;
            case 2:
                contaBancaria.checarDadosCliente();
                contaBancaria.verificarSaldo();
                break;
            case 3:
                contaBancaria.checarDadosCliente();
                contaBancaria.verificarLimite();
                break;
        }
    }
}