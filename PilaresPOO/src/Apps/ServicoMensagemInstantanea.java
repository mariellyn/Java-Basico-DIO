package Apps;

public abstract class ServicoMensagemInstantanea {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadointernet(){
        System.out.println("Validando se esta conectado internet");
    }
}
