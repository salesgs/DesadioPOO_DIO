import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

     Curso curso1 = new Curso();
     curso1.setTitulo("curso Java");
     curso1.setDescricao("Descrição curso java");
     curso1.setCargaHoraria(8);

     System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("Descrição curso java");
        curso2.setCargaHoraria(4);

        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentória de Java");
        mentoria.setDescrica("descrição mentória java");
        mentoria.setData(LocalDate.now()); //atibute date objetct  create

        System.out.println(mentoria);

    }

}