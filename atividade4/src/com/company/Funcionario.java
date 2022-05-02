package com.company;

public class Funcionario {
    public String nomeFuncionario;
    public String ondeTrabalha;
    public double salario;
    public String entradaBanco;
    public String rg;
    public boolean presenca;

    void bonificar(double bonificacao){
        this.salario += bonificacao;
    }

    void demitir(String demitido){
        this.presenca = false;
    }

    void mostrarDados(String nomeFuncionario, String ondeTrabalha, double salario, String entradaBanco, String rg, boolean presenca ){
        System.out.println("Nome do funcionario: " + getNomeFuncionario() + "\n" +
                "Departamento: " + getOndeTrabalha() + "\n" +
                "Salario: " + getSalario() + "\n" +
                "Entrada no banco: " + getEntradaBanco() + "\n" +
                "RG do funcionario: " + getRg() + "\n" +
                "Funcionario presente: " + isPresenca() + "\n");
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getOndeTrabalha() {
        return ondeTrabalha;
    }

    public void setOndeTrabalha(String ondeTrabalha) {
        this.ondeTrabalha = ondeTrabalha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        salario = salario;
    }

    public String getEntradaBanco() {
        return entradaBanco;
    }

    public void setEntradaBanco(String entradaBanco) {
        this.entradaBanco = entradaBanco;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        rg = rg;
    }

    public boolean isPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }

}
