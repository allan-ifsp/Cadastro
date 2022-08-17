package br.edu.ifsp.scl.ads.pdm.allan.cadastro.model;

public class Formulario {

    private String nome;
    private String telefone;
    private String email;
    private boolean salvarEmail;
    private String sexo;
    private String cidade;
    private String UF;

    public Formulario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSalvarEmail() {
        return salvarEmail;
    }

    public void setSalvarEmail(boolean salvarEmail) {
        this.salvarEmail = salvarEmail;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", cadastrarEmail='" + salvarEmail + '\'' +
                ", sexo='" + sexo + '\'' +
                ", cidade='" + cidade + '\'' +
                ", UF='" + UF + '\'' +
                '}';
    }
}
