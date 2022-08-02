import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcampa Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Ja Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKarol = new Dev();
        devKarol.setNome("Karol");
        devKarol.inscreverBootcampa(bootcamp);
        System.out.println("Conteudos Inscritos Karol" + devKarol.getConteudosInscritos());

        devKarol.progredir();
        devKarol.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Karol" + devKarol.getConteudosInscritos());
        System.out.println("Conteudos Inscritos Karol" + devKarol.getConteudosConcluidos());
        System.out.println("XP: " + devKarol.calculartotalXp());

        System.out.println("------------------------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcampa(bootcamp);
        System.out.println("Conteudos Inscritos Camila " + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Inscritos Camila " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calculartotalXp());


    }
}
