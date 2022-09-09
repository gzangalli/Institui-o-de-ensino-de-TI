package Listas;

import Modelo.Aluno;

public class ListaAluno {
    private NodoAluno inicio = null;
    private NodoAluno fim = null;
    private int qtd;
    private NodoAluno aux;

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public class NodoAluno {
        private Aluno info;
        private NodoAluno prox;

        public Aluno getInfo() {
            return info;
        }

        public void setInfo(Aluno info) {
            this.info = info;
        }

        public NodoAluno getProx() {
            return prox;
        }

        public void setProx(NodoAluno prox) {
            this.prox = prox;
        }
    }

    public void addAluno (Aluno aluno){

        aux =  new NodoAluno();

        if (inicio == null) {
            aux.setInfo(aluno);
            inicio = aux;
            fim = aux;
            inicio.setProx(inicio);
            fim = inicio;
            qtd++;
        }
        else if(qtd == 1) {
            qtd++;
            aux.setInfo(aluno);
            inicio.setProx(aux);
            aux.setProx(inicio);
            fim = aux;
        }
        else{
            aux.setInfo(aluno);
            aux.setProx(inicio);
            fim.setProx(aux);
            fim = aux;
            qtd++;
        }
    }
}
