package Modelo;

public class Professor {
    private int cod_Professor;
    private String nome_Professor;
    private String email_Professor;
    private String localDeFormacao;

    public int getCod_Professor() {
        return cod_Professor;
    }

    public void setCod_Professor(int cod_Professor) {
        this.cod_Professor = cod_Professor;
    }

    public String getNome_Professor() {
        return nome_Professor;
    }

    public void setNome_Professor(String nome_Professor) {
        this.nome_Professor = nome_Professor;
    }

    public String getEmail_Professor() {
        return email_Professor;
    }

    public void setEmail_Professor(String email_Professor) {
        this.email_Professor = email_Professor;
    }

    public String getLocalDeFormacao() {
        return localDeFormacao;
    }

    public void setLocalDeFormacao(String localDeFormacao) {
        this.localDeFormacao = localDeFormacao;
    }
}
