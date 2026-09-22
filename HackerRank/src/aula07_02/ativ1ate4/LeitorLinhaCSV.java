/*package aula07_02;

public class LeitorLinhaCSV {
    public static void main(String[] args) {

        String linha = "Maria,28,ATIVO";
        String outraLinha = "maria,28,ativo";

        String[] dados = linha.split(",");

        System.out.println(dados[0]);
        System.out.println(dados[1]);
        System.out.println(dados[2]);

        System.out.println(linha.equals(outraLinha));
        System.out.println(linha.equalsIgnoreCase(outraLinha));

        String frase = String.format(
                "Nome: %s | Idade: %s anos | Status: %s",
                dados[0], dados[1], dados[2]
        );

        System.out.println(frase);
    }
}

 */