/*
Java Fundamentos
Orientação a Objetos - Recursividade

Exercício 001
Escreva um método recursivo e estático que calcule e retorne o N-ésimo termo da sequência Fibonacci. Alguns números desta sequência são: 0,1,2,3,5,8,13,21,34,55,89,..kls
 */
public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int fatorial = fibonacci.calcularFibonacci(5);
        System.out.println("O TERMO DA SEQUÊNCIA DE FIBONACCI É: " + fatorial);
    }
}