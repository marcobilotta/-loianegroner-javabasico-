public class Aluno {
    int matricula;
    double disciplina1Nota1;
    double disciplina1Nota2;
    double disciplina1Nota3;
    double media1;
    double disciplina2Nota1;
    double disciplina2Nota2;
    double disciplina2Nota3;
    double media2;
    double disciplina3Nota1;
    double disciplina3Nota2;
    double disciplina3Nota3;
    double media3;
    String nomeCompleto;
    String curso;
    String disciplina1;
    String disciplina2;
    String disciplina3;

    void verificarMedia() {
        media1 = (disciplina1Nota1 + disciplina1Nota2 + disciplina1Nota3) / 3;
        media2 = (disciplina2Nota1 + disciplina2Nota2 + disciplina2Nota3) / 3;
        media3 = (disciplina3Nota1 + disciplina3Nota2 + disciplina3Nota3) / 3;
        if ((media1 < 7) || (media2 < 7) || (media3 < 7)) {
            System.out.println("ALUNO REPROVADO!");
        } else {
            System.out.println("ALUNO APROVADO!");
        }
    }
}
