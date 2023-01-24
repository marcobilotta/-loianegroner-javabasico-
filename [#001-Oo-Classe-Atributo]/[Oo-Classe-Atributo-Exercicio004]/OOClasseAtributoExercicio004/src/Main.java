/*
Java Fundamentos
Orientação a Objetos - Classe e Atributo

Exercício 004
Usando o resultado do modelo "Livro" como base, crie uma classe "LivroDeBiblioteca" que represente os dados básicos de um livro de uma biblioteca que pode ser emprestado a leitores.
 */

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nomeDoLivro = "SCRUM - A ARTE DE FAZER O DOBRO DO TRABALHO NA METADE DO TEMPO";
        livro.autor = "JEFF SUTHERLAND";
        livro.editora = "SEXTANTE";
        livro.quantidadePaginas = 254;
        livro.anoLancamento = 2014;
        livro.isbn = "978-85-431-0716-5";
        livro.nomeDoAluno = "JOSÉ MARIA DA SILVA";
        livro.turma = "2 ANO A - ENSINO MÉDIO";
        livro.dataDeRetirada = "23/01/2023";
        livro.dataParaEntrega = "30/01/2023";

        System.out.println("===========================================");
        System.out.println("====== SISTEMA BIBLIOTECÁRIO - ETEC =======");
        System.out.println("===========================================");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("- NOME DO ALUNO: " + livro.nomeDoAluno);
        System.out.println("- TURMA: " + livro.turma);
        System.out.println("- NOME DO LIVRO: " + livro.nomeDoLivro);
        System.out.println("- AUTOR: " + livro.autor);
        System.out.println("- EDITORA: " + livro.editora);
        System.out.println("- QUANTIDADE DE PÁGINAS: " + livro.quantidadePaginas);
        System.out.println("- ANO DE LANÇAMENTO: " + livro.anoLancamento);
        System.out.println("- ISBN: " + livro.isbn);
        System.out.println("- DATA DE RETIRADA DO LIVRO: " + livro.dataDeRetirada);
        System.out.println("- DATA PARA ENTREGA DO LIVRO: " + livro.dataParaEntrega);
    }
}