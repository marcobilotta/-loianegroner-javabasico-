/*
Java Fundamentos
Orientação a Objetos - Classe e Atributo

Exercício 006
Crie uma classe que represente um contato da agenda do seu celular.
 */

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.nomeCompleto = "EDU GUEDES";
        contato.empresaQueTrabalha = "GRUPO BANDEIRANTES DE TELEVISÃO";
        contato.email = "eduguedes@grupoband.com.br";
        contato.grupo = "NETWORKING";
        contato.celular = "(19) 9 7109-1617";
        contato.telefoneComercial = "(19) 3608-3628";
        contato.telefoneResidencial = "(19) 3681-2360";

        System.out.println("========================================================");
        System.out.println("===================== MOTOROLA V3 ======================");
        System.out.println("================= AGENDA DE CONTATOS ===================");
        System.out.println("- NOME: " + contato.nomeCompleto);
        System.out.println("- EMPRESA QUE TRABALHA: " + contato.empresaQueTrabalha);
        System.out.println("- E-MAIL: " + contato.email);
        System.out.println("- GRUPO: " + contato.grupo);
        System.out.println("- CELULAR: " + contato.celular);
        System.out.println("- TELEFONE COMERCIAL: " + contato.telefoneComercial);
        System.out.println("- TELEFONE RESIDENCIAL: " + contato.telefoneResidencial);
    }
}