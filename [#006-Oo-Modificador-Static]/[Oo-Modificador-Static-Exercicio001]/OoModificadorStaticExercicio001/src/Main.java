/*2
Java Fundamentos
Orientação a Objetos - Modificador Static

Exercício 001
Escreva uma classe chamada Contador, que tem um atributo estático que é incrementado sempre que a classe for instanciada.
Crie métodos para zerar, incrementar e retornar o valor do contador.
Desenvolva um programa para testar essa classe.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;

        System.out.println("DIGITE A OPÇÃO DESEJADA: ");
        System.out.println("1- ZERAR O CONTADOR");
        System.out.println("2- INCREMENTAR O CONTADOR");
        System.out.println("3- RETORNAR O VALOR DO CONTADOR");
        Scanner entradaMenu = new Scanner(System.in);
        opcao = entradaMenu.nextInt();
        switch (opcao) {
            case 1:
                Contador.zerarIncremento();
                break;
            case 2:
                Contador.incrementar();
                break;
            case 3:
                Contador.retornarValorIncremento();
                break;
        }

    }
}