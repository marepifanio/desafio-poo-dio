import br.com.dio.desafio.dominio.*;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().addAll(Arrays.asList(curso1, curso2, mentoria));

        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        System.out.println("Conteúdos Inscritos Marcelo: " + devMarcelo.getConteudosInscritos());
        System.out.println("XP Marcelo: " + devMarcelo.calcularXp());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        System.out.println("\nConteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP Camila: " + devCamila.calcularXp());

        System.out.println("\n---------------Inscrevendo Devs----------------");

        devCamila.inscreverBootcamp(bootcamp);
        devMarcelo.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Marcelo: " + devMarcelo.getConteudosInscritos());
        System.out.println("XP Marcelo: " + devMarcelo.calcularXp());

        System.out.println("\nConteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP Camila: " + devCamila.calcularXp());


        System.out.println("\n----------------Progredindo no Bootcamp----------------");

        devCamila.progredir();
        devCamila.progredir();
        devMarcelo.progredir();

        System.out.println("Conteúdos Inscritos Marcelo: " + devMarcelo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Marcelo: " + devMarcelo.getConteudosConcluidos());
        System.out.println("XP Marcelo: " + devMarcelo.calcularXp());

        System.out.println("\nConteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP Camila: " + devCamila.calcularXp());

    }
}
