import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição BootCamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRoberto = new Dev();
        devRoberto.setNome("Roberto");
        devRoberto.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Incritos Roberto: " + devRoberto.getConteudosInscritos());
        devRoberto.progredir();
        devRoberto.progredir();
        System.out.println("-");
        System.out.println("Conteudos Incritos Roberto: " + devRoberto.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Roberto: " + devRoberto.getConteudosConcluidos());
        System.out.println("XP: " + devRoberto.calcularTotalXp());

        System.out.println("---------------------");

        Dev devCamila = new Dev();
        devRoberto.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Incritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Incritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());



    }
}
