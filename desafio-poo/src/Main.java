import java.time.LocalDate;

import desafioDio.dominio.Bootcamp;
import desafioDio.dominio.Curso;
import desafioDio.dominio.Dev;
import desafioDio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(7);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição JAVA Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devSanches = new Dev();
        devSanches.setNome("Sanches");
        devSanches.inscreverBootcamp(bootcamp);
        devSanches.setDocumento(1234567891);
        System.out.println("Conteúdos Inscritos Sanches " + devSanches.getConteudosInscritos());

        Dev devLima = new Dev();
        devLima.setNome("Lima");
        devLima.inscreverBootcamp(bootcamp);
        devLima.setDocumento(1234567891);
        System.out.println("Conteúdos Inscritos Lima " + devLima.getConteudosInscritos());


    }
}