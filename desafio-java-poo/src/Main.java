import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.text.ParseException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Como criar um portifólio top");
        mentoria.setDescricao("Descrição da mentoria");
        System.out.print("Data: ");
        LocalDate date = LocalDate.now();

        mentoria.setData(date);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Conteudo conteudo1 = curso1;
        Conteudo conteudo2 = mentoria;

        System.out.println(conteudo1.calculaXp());
        System.out.println(conteudo2.calculaXp());


    }
}
