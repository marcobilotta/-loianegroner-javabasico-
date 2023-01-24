/*
Java Fundamentos
Orientação a Objetos - Classe e Atributo

Exercício 003
Usando o resultado do exercício anterior como base, crie uma classe "LivroDeLivraria" que representará os dados básicos de um livro que está à venda em uma livraria.
*/

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nomeDoLivro = "O MENINO MALUQUINHO";
        livro.autor = "ZIRALDO ALVES PINTO";
        livro.editora = "MELHORAMENTOS";
        livro.quantidadePaginas = 110;
        livro.anoLancamento = 2018;
        livro.isbn = "978-8506055106";

        System.out.println("=======================================");
        System.out.println("========= LIVRARIA SARAIVA ============");
        System.out.println("=======================================");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println("- LIVRO:" + livro.nomeDoLivro);
        System.out.println("- AUTOR:" + livro.autor);
        System.out.println("- EDITORA:" + livro.editora);
        System.out.println("- QUANTIDADE DE PÁGINAS:" + livro.quantidadePaginas);
        System.out.println("- ISBN:" + livro.isbn);

    }
}