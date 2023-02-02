public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Tyrion");

        Endereco endereco1 = new Endereco();
        endereco1.setNomeRua("Rua Game of Thrones");
        endereco1.setNumero("99");
        endereco1.setComplemento("Não Possui");
        endereco1.setCidade("Kings Landing");
        endereco1.setEstado("Westeros");
        endereco1.setCep("11111-222");

        Telefone telefone1 = new Telefone();
        telefone1.setTipo("Celular");
        telefone1.setDdd("019");
        telefone1.setNumero("9 9999-3333");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Residência");
        telefone2.setDdd("011");
        telefone2.setNumero("9 9999-8888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone1;
        telefones[1] = telefone2;

        contato.setEndereco(endereco1);
        contato.setTelefones(telefones);

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getNomeRua());
        }
        if (contato != null && contato.getTelefones() != null) {
            for (Telefone fone : contato.getTelefones()) {
                System.out.println(fone.getDdd() + " " + fone.getNumero());
            }
        }
    }
}