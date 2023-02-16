package com.example.desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cenarios {

    public static void main(String[] args) {

        Animal elefante = new Elefante(500, "herbívoro", "andar");
        Animal aguia = new Aguia(20, "carnívoro", "voar");
        Animal lobo = new Lobo(85, "carnívoro", "andar");

        List<Animal> animalList = List.of(elefante, aguia, lobo);

        var animaisCarnivoros = animalList
                .stream()
                .filter(element -> {
                    return Objects.equals(element.alimentacao, "carnívoro");
                })
                .collect(Collectors.toList());

        System.out.println(animaisCarnivoros);

        var animaisQueAndam = animalList
                .stream()
                .filter(element -> {
                    return Objects.equals(element.locomocao, "andar");
                })
                .collect(Collectors.toList());

        System.out.println(animaisQueAndam);

        var animailMaiorCarnivoro = animalList
                .stream()
                .filter(element -> {
                    return Objects.equals(element.alimentacao, "carnivoro");
                })
                ;

        System.out.println(animaisQueAndam);
    }
}
