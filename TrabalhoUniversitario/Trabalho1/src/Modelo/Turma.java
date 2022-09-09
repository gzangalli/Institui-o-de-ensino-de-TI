package Modelo;

public class Turma {
    private int cod_Turma;
    private Professor prof_Turma;
    private String disciplina;

    public int getCod_Turma() {
        return cod_Turma;
    }

    public void setCod_Turma(int cod_Turma) {
        this.cod_Turma = cod_Turma;
    }

    public Professor getProf_Turma() {
        return this.prof_Turma;
    }

    public void setProf_Turma(Professor prof_Turma) {
        this.prof_Turma = prof_Turma;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
