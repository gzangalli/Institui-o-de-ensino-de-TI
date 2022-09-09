package Interface;

import Modelo.Professor;

import java.util.Scanner;

public class InterfaceProfessor {
    public Professor dados_Professor() {    //Método desenvolvido para cadastrar informações de professores.

        Professor professor = new Professor();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o código do professor: ");
        int codigo = entrada.nextInt();
        professor.setCod_Professor(codigo);
        entrada.nextLine();

        System.out.println("Digite o nome do professor: ");
        String nome = entrada.nextLine();
        professor.setNome_Professor(nome);

        System.out.println("Digite o E-mail do professor: ");
        String email = entrada.nextLine();
        professor.setEmail_Professor(email);

        System.out.println("Digite o local de formação do professor: ");
        String local = entrada.nextLine();
        professor.setLocalDeFormacao(local);

        return professor;
    }
}
