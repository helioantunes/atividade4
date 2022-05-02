package com.company;

public class Pessoa {

    public String nome;
    public double altura;
    public double peso;

    Pessoa(String nome, double altura, double peso){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }
    public String getNome(){
        return nome;
    }

    public String setNome(String nome) {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
