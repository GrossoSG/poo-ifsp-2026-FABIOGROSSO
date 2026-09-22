package aula07_02.testealunos;

import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void matricular(Aluno aluno) {
        alunos.add(aluno);
    }

    public double calcularMedia() {
        if (alunos.isEmpty()) {
            return 0;
        }

        double soma = 0;

        for (Aluno aluno : alunos) {
            soma += aluno.getNota();
        }

        return soma / alunos.size();
    }

    public Aluno encontrarMelhorAluno() {
        if (alunos.isEmpty()) {
            return null;
        }

        Aluno melhorAluno = alunos.get(0);

        for (Aluno aluno : alunos) {
            if (aluno.getNota() > melhorAluno.getNota()) {
                melhorAluno = aluno;
            }
        }

        return melhorAluno;
    }
}