public class Carro extends Veiculo {


    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
        
    }
    private void confereCombustivel(){
        System.out.println("Confere combustivel");
    }

    private void confereCambio(){
        System.out.println("Conferindo cambio em P");
    }
}
