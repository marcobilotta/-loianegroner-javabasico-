/*
Java Fundamentos
Orientação a Objetos - Classe e Método com Parâmetros e Métodos.

Exercício 003
Escreva uma Class para representar um aluno. Adicione atributos relacionados as características de um aluno, como nome, matrícula, curso que está matriculado,
nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas.
Desenvolva um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em uma determinada disciplina.
Escreva um programa para testar essa classe, que peça as informações do aluno ao usuário e ao final informa o nome das disciplinas, mostra as notas e mostra se
o aluno foi aprovado ou não.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================================================================");
        System.out.println("======================= SISUN UNIP - SECRETARIA ONLINE ==================================");
        System.out.println("=========================================================================================");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("============================ INFORMAÇÕES DO ALUNO =======================================");
        Scanner lerEntradaAluno = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("INSIRA O NOME: ");
        aluno.nomeCompleto = lerEntradaAluno.nextLine();
        System.out.println("INSIRA A MATRÍCULA: ");
        aluno.matricula = lerEntradaAluno.nextInt();
        System.out.println("INSIRA O CURSO: ");
        aluno.curso = lerEntradaAluno.next();
        System.out.println("DIGITE A PRIMEIRA DISCIPLINA CURSADA: ");
        aluno.disciplina1 = lerEntradaAluno.next();
        System.out.println("DIGITE AS 3 NOTAS DA PRIMEIRA DISCIPLINA INFORMADA: ");
        aluno.disciplina1Nota1 = lerEntradaAluno.nextInt();
        aluno.disciplina1Nota2 = lerEntradaAluno.nextInt();
        aluno.disciplina1Nota3 = lerEntradaAluno.nextInt();
        System.out.println("AGORA, DIGITE A SEGUNDA DISCIPLINA CURSADA: ");
        aluno.disciplina2 = lerEntradaAluno.next();
        System.out.println("DIGITE AS 3 NOTAS DA SEGUNDA DISCIPLINA INFORMADA: ");
        aluno.disciplina2Nota1 = lerEntradaAluno.nextInt();
        aluno.disciplina2Nota2 = lerEntradaAluno.nextInt();
        aluno.disciplina2Nota3 = lerEntradaAluno.nextInt();
        System.out.println("POR FIM, DIGITE A TERCEIRA E ÚLTIMA DISCIPLINA CURSADA: ");
        aluno.disciplina3 = lerEntradaAluno.next();
        System.out.println("DIGITE AS 3 NOTAS DA SEGUNDA DISCIPLINA INFORMADA: ");
        aluno.disciplina3Nota1 = lerEntradaAluno.nextInt();
        aluno.disciplina3Nota2 = lerEntradaAluno.nextInt();
        aluno.disciplina3Nota3 = lerEntradaAluno.nextInt();
        System.out.println("\n");
        System.out.println("==================== PROCESSANDO AS INFORMAÇÕES, AGUARDE... =============================");
        System.out.println("-----------------------------------------------------------------------------------------" + "\n");
        System.out.println("=========================================================================================");
        System.out.println("======================= SISUN UNIP - SECRETARIA ONLINE ==================================");
        System.out.println("=========================================================================================");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+============= BOLETIM ACADÊMICO ALUNO " + aluno.nomeCompleto + " ======================+");
        System.out.println("|---------------------------------------------------------------------------------------|");
        System.out.println("| APROVAÇÃO DO ALUNO [ (MÉDIA1 + MÉDIA2 + MÉDIA3) / 3] > 7 ");
        aluno.verificarMedia();
        System.out.println("| DISCIPLINA 1: " + aluno.disciplina1 + " | NOTA 1: " + aluno.disciplina1Nota1 + " | NOTA 2: " + aluno.disciplina1Nota2 + " | NOTA 3: " + aluno.disciplina1Nota3 + " | MÉDIA: " + aluno.media1 + " | ");
        System.out.println("| DISCIPLINA 2: " + aluno.disciplina2 + " | NOTA 1: " + aluno.disciplina2Nota1 + " | NOTA 2: " + aluno.disciplina2Nota2 + " | NOTA 3: " + aluno.disciplina2Nota3 + " | MÉDIA: " + aluno.media2 + " | ");
        System.out.println("| DISCIPLINA 3: " + aluno.disciplina3 + " | NOTA 1: " + aluno.disciplina3Nota1 + " | NOTA 2: " + aluno.disciplina3Nota2 + " | NOTA 3: " + aluno.disciplina3Nota3 + " | MÉDIA: " + aluno.media3 + " | ");
        System.out.println("|---------------------------------------------------------------------------------------|");

    }
}