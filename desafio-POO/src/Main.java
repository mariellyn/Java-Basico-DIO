import java.time.LocalDate;

import desafioPOO.Bootcamp;
import desafioPOO.Curso;
import desafioPOO.Dev;
import desafioPOO.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso jS");
        curso2.setDescricao("descricao curso jS");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria em java");
        mentoria.setDescricao("descricao");
        mentoria.setData(LocalDate.now());
        
        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria); 



        Dev devMariellyn = new Dev();
        devMariellyn.setNome("Mariellyn");
        devMariellyn.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Mariellyn:" + devMariellyn.getConteudosInscritos());
        devMariellyn.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Mariellyn:" + devMariellyn.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Mariellyn:" + devMariellyn.getConteudosConcluidos());
        System.out.println("XP:" + devMariellyn.calcularTotalXp());


        System.out.println("---------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.increverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Maria:" + devMaria.getConteudosConcluidos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Maria:" + devMaria.getConteudosConcluidos());
        System.out.println("Conteudos Concluidos Maria:" + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());
    }

}
