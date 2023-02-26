package com.example.observer;

import java.util.ArrayList;
import java.util.List;

public class ProtocoloImpl implements Protocolo{

    List<Observer> observerList;
    private String mensagem;
    private boolean status;

    public ProtocoloImpl() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public Protocolo registrar(Observer observer) {
        if (observer == null) throw new RuntimeException();
        this.observerList.add(observer);
        return this;
    }

    @Override
    public Protocolo esquecer(Observer observer) {
        this.observerList.remove(observer);
        return this;
    }

    @Override
    public void notificar() {
        if(!status) return;
        this.observerList.stream()
                .forEach(element -> element.atualizar());
        this.status = false;
    }

    @Override
    public String getMensagem(Observer observer) {
        return this.mensagem;
    }

    @Override
    public void publicar(String mensagem) {
        this.mensagem = mensagem;
        this.status = true;
        this.notificar();
    }
}
