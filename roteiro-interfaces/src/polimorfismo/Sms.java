package polimorfismo;

public class Sms extends Notificacao{
    public Sms(String destinatario){
        super(destinatario);
    }

    @Override
    public void enviar(String mensagem){
        System.out.println("[SMS] Para: " + destinatario);
        System.out.println(mensagem.substring(0,
                Math.min(20, mensagem.length())));
    }
}
