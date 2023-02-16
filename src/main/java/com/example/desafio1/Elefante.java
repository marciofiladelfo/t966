package com.example.desafio1;

public class Elefante extends Animal {

    public Elefante(int peso, String alimentacao, String locomocao) {
        super(peso, alimentacao, locomocao);
    }

    @Override
    public String toString() {
        return "Elefante{" +
                "peso='" + peso + '\'' +
                ", alimentacao='" + alimentacao + '\'' +
                ", locomocao='" + locomocao + '\'' +
                "} ";
    }
}
