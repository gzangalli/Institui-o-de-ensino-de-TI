package Listas;

import Modelo.Turma;

public class ListaTurma {
    private NodoTurma inicio = null;
    private NodoTurma fim = null;
    private int qtd;
    private NodoTurma aux;

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public NodoTurma getInicio() {
        return inicio;
    }

    public void setInicio(NodoTurma inicio) {
        this.inicio = inicio;
    }

    public class NodoTurma {
        private Turma info;
        private NodoTurma prox;

        public Turma getInfo() {
            return info;
        }

        public void setInfo(Turma info) {
            this.info = info;
        }

        public NodoTurma getProx() {
            return prox;
        }

        public void setProx(NodoTurma prox) {
            this.prox = prox;
        }
    }

    public void addTurma (Turma turma){

        aux =  new NodoTurma();

        if (inicio == null) {
            aux.setInfo(turma);
            inicio = aux;
            fim = aux;
            inicio.setProx(inicio);
            fim = inicio;
            qtd++;
        }
        else if(qtd == 1) {
            qtd++;
            aux.setInfo(turma);
            inicio.setProx(aux);
            aux.setProx(inicio);
            fim = aux;
        }
        else{
            aux.setInfo(turma);
            aux.setProx(inicio);
            fim.setProx(aux);
            fim = aux;
            qtd++;
        }
    }
}
