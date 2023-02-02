/*
Java Fundamentos
Orientação a Objetos - Recursividade

Exercício 002
Escreva um método recursivo e estático que receba um número inteiro positivo N e calcule o somatório dos números de 1 a N.
 */
public class Main {
    public static void main(String[] args) {
        int soma;

        soma = Somatorio.calcularSomatorioRecursivo(5);
        System.out.println("O VALOR DO SOMATÓRIO DE 1 AO ELEMENTO DIGITADO É: " + soma);
    }
}