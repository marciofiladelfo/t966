package com.example.observer;

public interface Protocolo {

    Protocolo registrar(Observer observer);
    Protocolo esquecer(Observer observer);
    void modificar();
    String getMensagem(Observer observer);
    void publicar(String mensagem);
}
