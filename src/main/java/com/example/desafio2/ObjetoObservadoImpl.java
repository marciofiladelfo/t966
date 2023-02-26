package com.example.desafio2;

import java.util.ArrayList;
import java.util.List;

public class ObjetoObservadoImpl implements ObjetoObservado {

    List<Observador> observadorList;
    private String mensagem;
    private boolean status;

    public ObjetoObservadoImpl() {
        this.observadorList = new ArrayList<>();
    }

    @Override
    public ObjetoObservado registrar(Observador observador) {
        if (observador == null) throw new RuntimeException();
        this.observadorList.add(observador);
        return this;
    }

    @Override
    public ObjetoObservado esquecer(Observador observador) {
        this.observadorList.remove(observador);
        return this;
    }

    @Override
    public void notificar() {
        if(!status) return;
        this.observadorList.stream()
                .forEach(element -> element.atualizar());
        this.status = false;
    }

    @Override
    public String getMensagem(Observador observador) {
        return this.mensagem;
    }

    @Override
    public void publicar(String mensagem) {
        this.mensagem = mensagem;
        this.status = true;
        this.notificar();
    }
}
