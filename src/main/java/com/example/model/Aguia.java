package com.example.model;

public class Aguia extends Animal {
    public Aguia(int peso, String alimentacao, String locomocao) {
        super(peso, alimentacao, locomocao);
    }

    @Override
    public String toString() {
        return "Aguia{" +
                "peso='" + peso + '\'' +
                ", alimentacao='" + alimentacao + '\'' +
                ", locomocao='" + locomocao + '\'' +
                "} ";
    }
}
