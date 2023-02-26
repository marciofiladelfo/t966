package com.example.observer;

public interface Protocolo {

    Protocolo registrar(Observer observer);
    Protocolo esquecer(Observer observer);
    void modificar();
    String getUpdate(Observer observer);
    void publicar(String mensagem);
}
