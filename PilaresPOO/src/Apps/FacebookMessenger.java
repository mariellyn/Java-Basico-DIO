package Apps;

public class FacebookMessenger extends ServicoMensagemInstantanea  {

    public void enviarMensagem(){
        validarConectadointernet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");

    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }


}
