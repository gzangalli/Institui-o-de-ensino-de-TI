package Interface;

import Modelo.Aluno;
import java.util.Scanner;

public class InterfaceAluno {
    public Aluno dados_Aluno() {        // Método desenvolvido para cadastro de informações do aluno.

        Aluno aluno = new Aluno();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o código do aluno: ");
        int codigo = entrada.nextInt();
        aluno.setCod_Aluno(codigo);
        entrada.nextLine();

        System.out.println("Digite o nome do aluno: ");
        String nome = entrada.nextLine();
        aluno.setNome_Aluno(nome);

        System.out.println("Digite o E-mail do aluno: ");
        String email = entrada.nextLine();
        aluno.setEmail_Aluno(email);

        return aluno;
    }
}
