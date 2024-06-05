package Pilares;

import Apps.FacebookMessenger;
import Apps.MSNMessenger;
import Apps.ServicoMensagemInstantanea;
import Apps.Telegram;

public class ContadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido="msn";

        if(appEscolhido.equals("msn"))
        smi = new MSNMessenger();
        else if(appEscolhido.equals("fcb"))
        smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
        smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();

        
    }

}

