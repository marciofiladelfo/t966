package com.example.model;

public class Lobo extends Animal {
    public Lobo(int peso, String alimentacao, String locomocao) {
        super(peso, alimentacao, locomocao);
    }

    @Override
    public String toString() {
        return "Lobo{" +
                "peso='" + peso + '\'' +
                ", alimentacao='" + alimentacao + '\'' +
                ", locomocao='" + locomocao + '\'' +
                "} ";
    }
}
