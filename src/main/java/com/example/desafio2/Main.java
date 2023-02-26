package com.example.desafio2;

public class Main {
    public static void main(String[] args) {
        ObjetoObservado objetoObservado = new ObjetoObservadoImpl();
        Observador obs1 = new ObservadorImpl(objetoObservado, "OBS-CEU");
        objetoObservado.registrar(obs1);
        objetoObservado.publicar("O eclipse lunar iniciou");
        objetoObservado.esquecer(obs1);
        objetoObservado.registrar(obs1);
        objetoObservado.publicar("O eclipse lunar terminou");

        ObjetoObservado objetoObservado2 = new ObjetoObservadoImpl();
        Observador obs2 = new ObservadorImpl(objetoObservado2, "OBS-AGUA");
        objetoObservado2.registrar(obs2);
        objetoObservado2.publicar("Encontramos uma alga rara");
        objetoObservado2.esquecer(obs2);
        objetoObservado2.registrar(obs2);
        objetoObservado2.publicar("Nada a revelar");

        ObjetoObservado objetoObservado3 = new ObjetoObservadoImpl();
        Observador obs3 = new ObservadorImpl(objetoObservado3, "OBS-TERRA");
        objetoObservado3.registrar(obs3);
        objetoObservado3.publicar("Nada a revelar");
        objetoObservado3.esquecer(obs3);
        objetoObservado3.registrar(obs3);
        objetoObservado3.publicar("Encontramos o Wally");
    }
}
