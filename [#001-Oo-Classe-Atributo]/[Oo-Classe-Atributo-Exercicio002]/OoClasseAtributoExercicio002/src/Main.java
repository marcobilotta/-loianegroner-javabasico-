/*
Java Fundamentos
Orientação a Objetos - Classe e Atributos

Exercício 002
Crie uma classe Livro que represente os dados básicos de um livro, sem se preocupar com a sua finalidade.
*/

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nomeDoLivro = "INTELIGÊNCIA EMOCIONAL";
        livro.autor = "DANIEL GOLEMAN";
        livro.editora = "OBJETIVA";
        livro.quantidadePaginas = 383;
        livro.anoLancamento = 2016;
        livro.isbn = "978-85-7302-080-9";

        System.out.println("=====================================");
        System.out.println("====== AMAZON LIVROS E E-BOOKS ======");
        System.out.println("=====================================");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("- LIVRO:" + livro.nomeDoLivro);
        System.out.println("- AUTOR:" + livro.autor);
        System.out.println("- EDITORA:" + livro.editora);
        System.out.println("- QUANTIDADE DE PÁGINAS:" + livro.quantidadePaginas);
        System.out.println("- ANO DE LANÇAMENTO:" + livro.anoLancamento);
        System.out.println("- ISBN:" + livro.isbn);
    }
}