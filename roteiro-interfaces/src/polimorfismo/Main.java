package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Notificacao[] canais = {
                new Email("ana@exemplo.com"),
                new Sms("(11) 99999-0000"),
                new Notificacao("Geral")
        };

        for (Notificacao n : canais){
            n.enviar("Sua matricula foi confirmada com sucesso!");
        }

        for (Notificacao n : canais) {
            avisar(n);
        }

        ((Email) canais[0]).anexarArquivo("edital.pdf");
    }
    static void avisar(Notificacao n) {
        n.enviar("Prova adiada para sexta-feira.");
    }
}


