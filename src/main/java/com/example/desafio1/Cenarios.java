package com.example.desafio1;

import com.example.model.Aguia;
import com.example.model.Animal;
import com.example.model.Elefante;
import com.example.model.Lobo;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Cenarios {

    public static void main(String[] args) {

        Animal elefante = new Elefante(500, "herbívoro", "andar");
        Animal aguia = new Aguia(20, "carnívoro", "voar");
        Animal lobo = new Lobo(85, "carnívoro", "andar");

        List<Animal> animalList = List.of(elefante, aguia, lobo);

        var animaisCarnivoros = animalList
                .stream()
                .filter(element -> Objects.equals(element.getAlimentacao(), "carnívoro"))
                .collect(Collectors.toList());

        System.out.println(animaisCarnivoros);

        var animaisQueAndam = animalList
                .stream()
                .filter(element -> Objects.equals(element.getLocomocao(), "andar"))
                .collect(Collectors.toList());

        System.out.println(animaisQueAndam);

        var animaisCarnivorosQueAndam = animalList
                .stream()
                .filter(element -> Objects.equals(element.getAlimentacao(), "carnívoro"))
                .filter(element -> Objects.equals(element.getLocomocao(), "andar"))
                .collect(Collectors.toList());

        System.out.println(animaisCarnivorosQueAndam);

        var animalCarnivoroMaior = animaisCarnivoros
                .stream()
                .max(new Comparator<Animal>() {
                    @Override
                    public int compare(Animal a, Animal b) {
                        return Integer.compare(a.getPeso(), b.getPeso());
                    }
                });

        System.out.println(animalCarnivoroMaior);
    }
}
