package Listas;

import Modelo.Turma;
import Modelo.TurmaAluno;

public class ListaTurmaAluno {
    private Turma_Aluno inicio = null;
    private Turma_Aluno fim = null;
    private int qtd;
    private Turma_Aluno aux;

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public Turma_Aluno getInicio() {
        return inicio;
    }

    public void setInicio(Turma_Aluno inicio) {
        this.inicio = inicio;
    }

    public class Turma_Aluno {
        private TurmaAluno info;
        private Turma_Aluno prox;

        public TurmaAluno getInfo() {
            return info;
        }

        public void setInfo(TurmaAluno info) {
            this.info = info;
        }

        public Turma_Aluno getProx() {
            return prox;
        }

        public void setProx(Turma_Aluno prox) {
            this.prox = prox;
        }
    }

    public int getQtd (Turma turma) {
        aux = inicio;
        int contador = 0;
        for (int cont = 0; cont < this.getQtd(); cont++){
            if (aux.getInfo().getTurma().getCod_Turma() == turma.getCod_Turma()){
                contador++;
            }
            aux = aux.getProx();
        }
        return contador;
    }

    public void getNomeAluno (Turma turma){
        aux = inicio;
        int nota1;
        int nota2;
        int nota3;
        int media;
        int posicaoAluno = 1;
        for (int cont = 0; cont < this.getQtd(); cont++){
            if (turma.getCod_Turma() == aux.getInfo().getTurma().getCod_Turma()) {
                System.out.println("Aluno " + posicaoAluno + ": " + (aux.getInfo().getAluno().getNome_Aluno()));
                nota1 = aux.getInfo().getNota1();
                System.out.println("  Nota 1: " + nota1);
                nota2 = aux.getInfo().getNota2();
                System.out.println("  Nota 2: " + nota2);
                nota3 = aux.getInfo().getNota3();
                System.out.println("  Nota 3: " + nota3);
                media = (nota1 + nota2 + nota3)/3;
                if (media >= 7){
                    System.out.println("Situação: APROVADO ");
                } else {
                    System.out.println("Situação: REPROVADO ");
                }
                posicaoAluno++;
            }
            aux = aux.getProx();
        }
    }

    public int getAprovacaoAluno (Turma turma){
        aux = inicio;
        int nota1;
        int nota2;
        int nota3;
        int media;
        int aprovado = 0;
        for (int cont = 0; cont < this.getQtd(); cont++){
            if (turma.getCod_Turma() == aux.getInfo().getTurma().getCod_Turma()) {
                nota1 = aux.getInfo().getNota1();
                nota2 = aux.getInfo().getNota2();
                nota3 = aux.getInfo().getNota3();
                media = (nota1 + nota2 + nota3)/3;
                if (media >= 7){
                    aprovado++;
                }
            }
            aux = aux.getProx();
        }
        return aprovado;
    }

    public float getPercentualAluno (Turma turma){
        aux = inicio;
        int nota1;
        int nota2;
        int nota3;
        int media;
        int aprovado = 0;
        float aluno_nessa_turma = 0;
        float percentual;
        for (int cont = 0; cont < this.getQtd(); cont++){
            if (turma.getCod_Turma() == aux.getInfo().getTurma().getCod_Turma()) {
                nota1 = aux.getInfo().getNota1();
                nota2 = aux.getInfo().getNota2();
                nota3 = aux.getInfo().getNota3();
                media = (nota1 + nota2 + nota3)/3;
                if (media >= 7){
                    aprovado++;
                }
                aluno_nessa_turma++;
            }
            aux = aux.getProx();
        }
        percentual = (aprovado * 100)/aluno_nessa_turma;
        return percentual;
    }

    public float getPercentualAlunoInstituicao ( ){
        aux = inicio;
        int nota1;
        int nota2;
        int nota3;
        int media;
        int aprovado = 0;
        float percentual;
        for (int cont = 0; cont < this.getQtd(); cont++){
            nota1 = aux.getInfo().getNota1();
            nota2 = aux.getInfo().getNota2();
            nota3 = aux.getInfo().getNota3();
            media = (nota1 + nota2 + nota3)/3;
            if (media >= 7){
                aprovado++;
            }
            aux = aux.getProx();
        }
        percentual = (aprovado * 100)/this.getQtd();
        return percentual;
    }

    public void addTurma_Aluno (TurmaAluno turma_aluno){
        aux =  new Turma_Aluno();

        if (inicio == null) {
            aux.setInfo(turma_aluno);
            inicio = aux;
            fim = aux;
            inicio.setProx(inicio);
            fim = inicio;
            qtd++;
        }
        else if(qtd == 1) {
            qtd++;
            aux.setInfo(turma_aluno);
            inicio.setProx(aux);
            aux.setProx(inicio);
            fim = aux;
        }
        else{
            aux.setInfo(turma_aluno);
            aux.setProx(inicio);
            fim.setProx(aux);
            fim = aux;
            qtd++;
        }
    }
}
