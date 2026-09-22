package aula07_02.testealunos;

public class TesteTurma {
    public static void main(String[] args) {

        Turma turma = new Turma();

        turma.matricular(new Aluno("Maria", 8.5));
        turma.matricular(new Aluno("João", 7.0));
        turma.matricular(new Aluno("Pedro", 9.5));
        turma.matricular(new Aluno("Ana", 6.5));

        System.out.println("Média: " + turma.calcularMedia());

        Aluno melhor = turma.encontrarMelhorAluno();

        System.out.println("Melhor aluno: " + melhor.getNome());
    }
}