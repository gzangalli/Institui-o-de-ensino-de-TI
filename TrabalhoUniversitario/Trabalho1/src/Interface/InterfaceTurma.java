package Interface;

import Modelo.Turma;
import Modelo.Professor;
import java.util.Scanner;

import java.util.Scanner;

public class InterfaceTurma {

    public Turma dados_Turma() {        // Método desenvolvido para cadastrar informações de uma turma.

        Turma turma = new Turma();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o código da turma: ");
        int codigo = entrada.nextInt();
        turma.setCod_Turma(codigo);

        System.out.println("Digite o nome da disciplina: ");
        entrada.nextLine();
        String disciplina = entrada.nextLine();
        turma.setDisciplina(disciplina);
        System.out.println(" ");

        System.out.println("Cadastro Professor");
        InterfaceProfessor console_Professor = new InterfaceProfessor();
        Professor professor = console_Professor.dados_Professor();
        System.out.println(" ");

        turma.setProf_Turma(professor);                             //Insere o professor em uma turma
        return (turma);
    }
}
