package com.example.desafio2;

public interface ObjetoObservado {

    ObjetoObservado registrar(Observador observador);
    ObjetoObservado esquecer(Observador observador);
    void notificar();
    String getMensagem(Observador observador);
    void publicar(String mensagem);
}
