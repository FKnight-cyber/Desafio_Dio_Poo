import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(140);

        Curso curso2 = new Curso();

        curso1.setTitulo("Python");
        curso1.setDescricao("Descrição do curso Python");
        curso1.setCargaHoraria(140);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Java");
        mentoria.setDescricao("Descrição do curso Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFulano = new Dev();
        devFulano.setNome("Fulano");
        devFulano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devFulano.getConteudosInscritos());
        devFulano.progredir();
        System.out.println("------------------");
        System.out.println("Conteúdos inscritos: " + devFulano.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devFulano.getConteudosConcluidos());
        System.out.println("XP: " + devFulano.calcularTotalXP());
        System.out.println("------------------");

        Dev devCicrano = new Dev();
        devCicrano.setNome("Cicrano");
        devCicrano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devCicrano.getConteudosInscritos());
        devCicrano.progredir();
        System.out.println("------------------");
        System.out.println("Conteúdos inscritos: " + devCicrano.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + devCicrano.getConteudosConcluidos());
        System.out.println("XP: " + devCicrano.calcularTotalXP());
    }
}