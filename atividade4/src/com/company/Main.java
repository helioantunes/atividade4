package com.company;

public class Main {

    public static void main(String[] args) {
        // Type[] objectName = new ClassName[];
        Pessoa[] array = new Pessoa[] {
                new Pessoa("Adriana", 1.70, 80.3),
                new Pessoa("Helio", 1.80, 75.0),
                new Pessoa("Maria", 1.72, 79.3),
                new Pessoa("Joao", 1.65, 50.2),
                new Pessoa("Daniela", 1.70, 60.3),
                new Pessoa("Lebron", 1.93, 50.2),
                new Pessoa("Gabriel", 1.69, 80.3),
                new Pessoa("Eduardo", 1.70, 67.3),
                new Pessoa("Gaston", 1.24, 80.3),
                new Pessoa("Enzo", 1.50, 50.3),
        };
        for (Pessoa array1 : array){
            System.out.println("Nome: " + array1.getNome() + "\n"+
                    "Altura: " + array1.getAltura() + "\n" +
                    "Peso: " + array1.getPeso() + "\n");
        }
        Empresa[] empresaArray = new Empresa[100];
    }
}
