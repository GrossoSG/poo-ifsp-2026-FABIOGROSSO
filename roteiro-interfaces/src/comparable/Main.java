package comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aluno> turma = new ArrayList<>();
        turma.add(new Aluno("Carla", 8.5));
        turma.add(new Aluno("Bruno", 9));
        turma.add(new Aluno("Ana", 8.5));
        turma.add(new Aluno("Diego", 6));

        System.out.println("Antes: ");
        for (Aluno aluno : turma){
            System.out.println(aluno);
        }

        Collections.sort(turma);

        System.out.println("\nRanking:");
        for (Aluno aluno : turma){
            System.out.println(aluno);
        }

    }
}
