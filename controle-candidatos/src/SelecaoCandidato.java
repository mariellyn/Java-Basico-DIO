import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelecaoCandidato {
    public static void main(String[] args) {
        String [] candidatos =  {"Maria " , "Ana " , "Junior " , "Augusto " , "Catarina " , "Cleber " , "Daniel " , "Jorge " , "Larissa " , "Paulo "}; 
        for(String candidato: candidatos){
            entrandoEmContato(candidato);   
        }

    }
        
        static void entrandoEmContato(String candidato){
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;
            do {

                atendeu= atender();
                continuarTentando = !atendeu;
                if(continuarTentando) 
                    tentativasRealizadas++;
                else
                System.out.println("Contato realizado com sucesso ");
                    
            }while(continuarTentando && tentativasRealizadas<3);

            if (atendeu) 
                System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativas ");

            else 
            System.out.println("Näo conseguimos contato com " + candidato + ", número máximo de tentativas " + tentativasRealizadas + " realizadas ");

                        

        }


    static boolean atender(){
        return new Random().nextInt(3)==1;
    }



    static void imprimirSelecionado(){
        String [] candidatos = {"Maria " , "Ana " , "Junior " , "Augusto " , "Catarina " , "Cleber " , "Daniel " , "Jorge " , "Larissa " , "Paulo "};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for( int indice=0; indice < candidatos.length;indice++){
            System.out.println("O candidato de numero: " +  indice  + " é " + candidatos[indice]);
        }

        System.out.println("Forma abrevida do For each");

        for(String candidato: candidatos){
            System.out.println("O candidato selecinado foi : " + candidato);

        }



    }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
           
        }else if (salarioBase ==salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
            
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }


    static double valorPretendido() {
            return ThreadLocalRandom.current().nextDouble(1800 ,2200);
        }


    static void SelecaoCandidatos () { 
        String [] candidatos = {"Maria " , "Ana " , "Junior " , "Augusto " , "Catarina " , "Cleber " , "Daniel " , "Jorge " , "Larissa " , "Paulo "};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            
            System.out.println("O candidato " + candidato + "solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println(" O candidato " + candidato + "foi selecionado para a vaga" );
                candidatosSelecionados++;
                
            }
            candidatosAtual++;
        }



        
    }
}
