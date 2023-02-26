package com.example.observer;

public class Main {
    public static void main(String[] args) {
        Protocolo protocolo = new ProtocoloImpl();
        Observer obs1 = new Observador(protocolo, "Bob");
        Observer obs2 = new Observador(protocolo, "Alice");
        Observer obs3 = new Observador(protocolo, "Sam");

        obs1.atualizar();
        protocolo.publicar("Parabéns você foi aprovado");
    }
}
