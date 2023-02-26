package com.example.desafio2;

public class ObservadorImpl implements Observador {

    private ObjetoObservado objetoObservado;
    private String name;

    public ObservadorImpl(ObjetoObservado objetoObservado, String name) {
        this.objetoObservado = objetoObservado;
        this.name = name;
    }

    @Override
    public void atualizar() {
        String mensagem = objetoObservado.getMensagem(this);
        System.out.println((mensagem == null) ? "[MSG] Não há mensagens"
                : "[" + this.name + "] OK : [MSG] : " + mensagem);
    }
}
