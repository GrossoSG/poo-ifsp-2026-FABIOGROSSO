/*package aula07_02;

public class ExtractorEmail {
    public static void main(String[] args) {

        String email = "joao.silva@ifsp.edu.br";

        int indice = email.indexOf('@');

        String usuario = email.substring(0, indice  );
        String dominio = email.substring(indice + 1);

        System.out.println("Usuário: " + usuario);
        System.out.println("Domínio: " + dominio);

        if (dominio.contains("ifsp")) {
            System.out.println("E-mail institucional");
        } else {
            System.out.println("E-mail externo");
        }
    }
}

 */