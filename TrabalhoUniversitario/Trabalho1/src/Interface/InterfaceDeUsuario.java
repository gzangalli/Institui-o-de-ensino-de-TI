package Interface;

import Listas.ListaAluno;
import Listas.ListaTurma;
import Listas.ListaTurmaAluno;
import Modelo.Aluno;
import Modelo.Turma;
import Modelo.TurmaAluno;
import java.util.Scanner;

public class InterfaceDeUsuario { // Interface de usuário
    public void menuPrincipal () {
        /*Scanner entrada = new Scanner(System.in);
        ListaTurma lista_turma = new ListaTurma();
        ListaAluno lista_aluno = new ListaAluno();
        ListaTurmaAluno lista_turma_aluno = new ListaTurmaAluno();

        this.mostrarMenu();
        int opcao = entrada.nextInt();

        while (opcao != 0) {
                switch (opcao) {
                    case 1:
                        ListaTurma.NodoTurma aux = lista_turma.getInicio();
                        for (int cont = 0; cont < lista_turma.getQtd(); cont++){
                            System.out.println("Código da turma: " + aux.getInfo().getCod_Turma());
                            System.out.println("Nome da disciplina: "+ aux.getInfo().getDisciplina());
                            System.out.println("Nome do professor: "+ aux.getInfo().getProf_Turma().getNome_Professor());
                            System.out.println("Quantidade de alunos na turma: "+ lista_turma_aluno.getQtd(aux.getInfo()));
                            System.out.println(" ");
                            aux = aux.getProx();
                        }
                        System.out.println("Pressione ENTER para retornar ao menu principal.");
                        entrada.nextLine();
                        entrada.nextLine();
                        break;

                    case 2:
                        int qtd_alunos = 0;
                        String continuar_aluno = "s";
                        String continuar_turma = "s";

                        while (continuar_turma.equals("s")){
                        System.out.println("Cadastro Turma");
                        InterfaceTurma console_Turma = new InterfaceTurma();
                        Turma turma = console_Turma.dados_Turma();
                        lista_turma.addTurma(turma);

                        while (continuar_aluno.equals("s") && qtd_alunos < 30) {
                            TurmaAluno turma_aluno = new TurmaAluno();
                            System.out.println("Cadastro Aluno");
                            InterfaceAluno console_Aluno = new InterfaceAluno();
                            Aluno aluno = console_Aluno.dados_Aluno();
                            qtd_alunos++;
                            lista_aluno.addAluno(aluno);

                            System.out.println("Digite a nota 1 do aluno: ");
                            int nota1 = entrada.nextInt();
                            System.out.println("Digite a nota 2 do aluno: ");
                            int nota2 = entrada.nextInt();
                            System.out.println("Digite a nota 3 do aluno: ");
                            int nota3 = entrada.nextInt();
                            entrada.nextLine();

                            turma_aluno.setNota1(nota1);
                            turma_aluno.setNota2(nota2);
                            turma_aluno.setNota3(nota3);
                            turma_aluno.setAluno(aluno);
                            turma_aluno.setTurma(turma);

                            lista_turma_aluno.addTurma_Aluno(turma_aluno);

                            System.out.println("Deseja cadastrar mais alunos? s = 'Sim' e n = 'Não' ");
                            continuar_aluno = entrada.nextLine();
                        }
                            System.out.println("Deseja cadastrar mais turmas? s = 'Sim' e n = 'Não' ");
                            continuar_turma = entrada.nextLine();
                        }
                        break;

                    case 3:
                        System.out.println("Digite o código da turma: ");
                        int codigoLido = entrada.nextInt();
                        ListaTurma.NodoTurma aux2 = lista_turma.getInicio();
                        for (int contCodigo = 0; contCodigo <= lista_turma.getQtd(); contCodigo++){
                            if (aux2.getInfo().getCod_Turma() == (codigoLido)){
                                System.out.println("Código da turma: "+ aux2.getInfo().getCod_Turma());
                                System.out.println("Nome da disciplina: "+ aux2.getInfo().getDisciplina());
                                System.out.println("Nome do professor: "+ aux2.getInfo().getProf_Turma().getNome_Professor());
                                lista_turma_aluno.getNomeAluno(aux2.getInfo());
                                break;
                            }
                            aux2 = aux2.getProx();
                        }
                        System.out.println("Pressione ENTER para retornar ao menu principal.");
                        entrada.nextLine();
                        break;

                    case 4:

                        ListaTurma.NodoTurma aux3 = lista_turma.getInicio();

                        for (int cont = 0; cont < lista_turma.getQtd(); cont++) {
                            System.out.println("Código da turma: " + aux3.getInfo().getCod_Turma());
                            System.out.println("Nome da disciplina: " + aux3.getInfo().getDisciplina());
                            System.out.println("Nome do professor: " + aux3.getInfo().getProf_Turma().getNome_Professor());
                            System.out.println("Quantidade de alunos na turma: " + lista_turma_aluno.getQtd(aux3.getInfo()));
                            System.out.println("Total de alunos aprovados: " + lista_turma_aluno.getAprovacaoAluno(aux3.getInfo()));
                            System.out.println("Percentual de alunos aprovados: " + lista_turma_aluno.getPercentualAluno(aux3.getInfo())+" %");
                            System.out.println(" ");
                            aux3 = aux3.getProx();
                        }

                        System.out.println("Total de matrículas na instituição: " + lista_turma_aluno.getQtd());

                        System.out.println("Percentual de alunos aprovados: " + lista_turma_aluno.getPercentualAlunoInstituicao()+" %");
                        // Cálculo com as notas dos alunos

                        System.out.println("Pressione ENTER para retornar ao menu principal.");
                        entrada.nextLine();
                        entrada.nextLine();
                        break;

                    case 5:
                        entrada.nextLine();
                        System.out.println("Deseja realmente sair? s - Sim / n - Não");
                        String continuar = entrada.nextLine();
                        if (continuar.equals("s")){
                            opcao = 0;
                            break;
                        }else{
                            this.mostrarMenu();
                            opcao = entrada.nextInt();
                        }
                        break;
                }
            }
        }
        private void mostrarMenu (){
            System.out.println("1. Listar todas as turmas");
            System.out.println("2. Informar dados de uma turma");
            System.out.println("3. Consultar os dados de uma turma");
            System.out.println("4. Consultar estatísticas gerais");
            System.out.println("5. Sair do sistema");
        }*/
        Scanner entrada = new Scanner(System.in);
        ListaTurma lista_turma = new ListaTurma();
        ListaAluno lista_aluno = new ListaAluno();
        ListaTurmaAluno lista_turma_aluno = new ListaTurmaAluno();

        int sair = 0;

        this.mostrarMenu();

        for (int opcao = entrada.nextInt(); sair != 1; opcao = entrada.nextInt()) {
            if (opcao > 5 || opcao < 1){
                System.out.println("Por favor, digite um índice válido (Opções de 1 a 5).");
            } else {
                switch (opcao) {
                    case 1:
                        ListaTurma.NodoTurma aux = lista_turma.getInicio();
                        for (int cont = 0; cont < lista_turma.getQtd(); cont++){
                            System.out.println("Código da turma: " + aux.getInfo().getCod_Turma());
                            System.out.println("Nome da disciplina: "+ aux.getInfo().getDisciplina());
                            System.out.println("Nome do professor: "+ aux.getInfo().getProf_Turma().getNome_Professor());
                            System.out.println("Quantidade de alunos na turma: "+ lista_turma_aluno.getQtd(aux.getInfo()));
                            System.out.println(" ");
                            aux = aux.getProx();
                        }
                        System.out.println("Pressione ENTER para retornar ao menu principal.");
                        entrada.nextLine();
                        entrada.nextLine();
                        break;

                    case 2:
                        int qtd_alunos = 0;
                        String continuar_aluno = "s";

                        System.out.println("Cadastro Turma");
                        InterfaceTurma console_Turma = new InterfaceTurma();
                        Turma turma = console_Turma.dados_Turma();
                        lista_turma.addTurma(turma);

                        while (continuar_aluno.equals("s") && qtd_alunos < 30) {
                            TurmaAluno turma_aluno = new TurmaAluno();
                            System.out.println("Cadastro Aluno");
                            InterfaceAluno console_Aluno = new InterfaceAluno();
                            Aluno aluno = console_Aluno.dados_Aluno();
                            qtd_alunos++;
                            lista_aluno.addAluno(aluno);

                            System.out.println("Digite a nota 1 do aluno: ");
                            int nota1 = entrada.nextInt();

                            System.out.println("Digite a nota 2 do aluno: ");
                            int nota2 = entrada.nextInt();

                            System.out.println("Digite a nota 3 do aluno: ");
                            int nota3 = entrada.nextInt();
                            entrada.nextLine();

                            turma_aluno.setNota1(nota1);
                            turma_aluno.setNota2(nota2);
                            turma_aluno.setNota3(nota3);
                            turma_aluno.setAluno(aluno);
                            turma_aluno.setTurma(turma);

                            lista_turma_aluno.addTurma_Aluno(turma_aluno);

                            System.out.println("Deseja cadastrar mais alunos? s = 'Sim' e n = 'Não' ");
                            continuar_aluno = entrada.nextLine();
                        }
                        break;

                    case 3:
                        System.out.println("Digite o código da turma: ");
                        int codigoLido = entrada.nextInt();
                        ListaTurma.NodoTurma aux2 = lista_turma.getInicio();
                        for (int contCodigo = 0; contCodigo <= lista_turma.getQtd(); contCodigo++){
                            if (aux2.getInfo().getCod_Turma() == (codigoLido)){
                                System.out.println("Código da turma: "+ aux2.getInfo().getCod_Turma());
                                System.out.println("Nome da disciplina: "+ aux2.getInfo().getDisciplina());
                                System.out.println("Nome do professor: "+ aux2.getInfo().getProf_Turma().getNome_Professor());
                                lista_turma_aluno.getNomeAluno(aux2.getInfo());
                                break;
                            }
                            aux2 = aux2.getProx();
                        }
                        System.out.println("Pressione ENTER para retornar ao menu principal.");
                        entrada.nextLine();
                        break;

                    case 4:

                        ListaTurma.NodoTurma aux3 = lista_turma.getInicio();

                        for (int cont = 0; cont < lista_turma.getQtd(); cont++) {
                            System.out.println("Código da turma: " + aux3.getInfo().getCod_Turma());
                            System.out.println("Nome da disciplina: " + aux3.getInfo().getDisciplina());
                            System.out.println("Nome do professor: " + aux3.getInfo().getProf_Turma().getNome_Professor());
                            System.out.println("Quantidade de alunos na turma: " + lista_turma_aluno.getQtd(aux3.getInfo()));
                            System.out.println("Total de alunos aprovados: " + lista_turma_aluno.getAprovacaoAluno(aux3.getInfo()));
                            System.out.println("Percentual de alunos aprovados: " + lista_turma_aluno.getPercentualAluno(aux3.getInfo())+"%");
                            System.out.println(" ");
                            aux3 = aux3.getProx();
                        }

                        System.out.println("Total de matrículas na instituição: " + lista_turma_aluno.getQtd());

                        System.out.println("Percentual de alunos aprovados: " + lista_turma_aluno.getPercentualAlunoInstituicao( )+"%");
                        // Cálculo com as notas dos alunos

                        System.out.println("Pressione ENTER para retornar ao menu principal.");
                        entrada.nextLine();
                        entrada.nextLine();
                        break;

                    case 5:
                        entrada.nextLine();
                        System.out.println("Deseja realmente sair? s - Sim / n - Não");
                        String continuar = entrada.nextLine();
                        if (continuar.equals("s")){
                            sair = 1;
                        }
                        break;
                }

                if (sair != 1) {
                    this.mostrarMenu();
                }
                else {
                    break;
                }
            }
        }
    }
    private void mostrarMenu (){
        System.out.println("1. Listar todas as turmas");
        System.out.println("2. Informar dados de uma turma");
        System.out.println("3. Consultar os dados de uma turma");
        System.out.println("4. Consultar estatísticas gerais");
        System.out.println("5. Sair do sistema");
}
}