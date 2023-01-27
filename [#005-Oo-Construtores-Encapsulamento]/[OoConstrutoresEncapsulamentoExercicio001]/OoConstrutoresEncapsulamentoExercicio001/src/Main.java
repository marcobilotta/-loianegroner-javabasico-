/*
Java Fundamentos
Orientação a Objetos - Construtores e Encapsulamento

Exercício 001
Reescreva os seguintes exercícios criandos todos os atributos do tipo privado, métodos Getters, Setters e os Construtores. Os métodos que serão utilizados pela classe de teste devem
ser públicos. Se necessário, crie métodos privados como auxiliares para organizar melhor o código fonte também.
Escreva uma classe para representar uma máquina de lavar roupa. Desenvolva métodos para ligar, lavar, centrifugar, secar e desligar a máquina.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;

        MaquinaLavar maquinaLavar = new MaquinaLavar();
        System.out.println("+---------------------------+");
        System.out.println("|  PAINEL MÁQUINA DE LAVAR  |");
        System.out.println("+---------------------------+");
        System.out.println("ESCOLHA A AÇÃO DESEJADA:");
        System.out.println("1- LIGAR");
        System.out.println("2- LAVAR");
        System.out.println("3- CENTRIFUGAR");
        System.out.println("4- SECAR");
        System.out.println("5- DESLIGAR");
        Scanner menu = new Scanner(System.in);
        opcao = menu.nextInt();
        switch (opcao) {
            case 1:
                maquinaLavar.ligarMaquina(true);
                break;
            case 2:
                maquinaLavar.lavarRoupa();
                break;
            case 3:
                maquinaLavar.centrifugarRoupa();
                break;
            case 4:
                maquinaLavar.secarRoupa();
                break;
            case 5:
                maquinaLavar.desligarMaquina(true);
                break;
            default:
                System.out.println("ESSA OPÇÃO NÃO EXISTE!");
                break;
        }
    }
}