import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(140);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Java");
        mentoria1.setDescricao("Descrição do curso Java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria1);
    }
}