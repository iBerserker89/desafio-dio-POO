import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLuciano = new Dev();
        devLuciano.setNome("Luciano");
        devLuciano.inscreverBootcamp(bootcamp);
        System.out.println("-----------");
        System.out.println("Conteúdos Inscritos Luciano: " + devLuciano.getConteudosInscritos());

        devLuciano.progredir();
        devLuciano.progredir();
        System.out.println("__");

        System.out.println("Conteúdos Inscritos Luciano: " + devLuciano.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos Concluídos Luciano: " + devLuciano.getConteudosConcluidos());
        System.out.println("--- XP: " + devLuciano.calcularTotalXp() + " ---");

        System.out.println("========================================");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("-----------");
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("__");

        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("-");
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("--- XP: " + devJoao.calcularTotalXp() + " ---");

    }
}
