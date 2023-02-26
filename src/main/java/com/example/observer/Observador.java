package com.example.observer;

public class Observador implements Observer{

    private Protocolo protocolo;
    private String name;

    public Observador(Protocolo protocolo, String name) {
        this.protocolo = protocolo;
        this.name = name;
        this.protocolo.registrar(this);
    }

    @Override
    public void atualizar() {
        String mensagem = protocolo.getMensagem(this);
        System.out.println((mensagem == null) ? "[MSG] Não há mensagens"
                : "[" + this.name + "] OK : [MSG] : " + mensagem);
    }

    @Override
    public void setProtocolo(Protocolo protocolo) {
        this.protocolo = protocolo;
    }
}
