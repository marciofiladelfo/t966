package com.example.desafio4;

import com.example.model.Aguia;
import com.example.model.Animal;
import com.example.model.Elefante;
import com.example.model.Lobo;
import io.reactivex.rxjava3.core.Observable;

import java.util.List;
import java.util.Objects;

public class RxJavaApp {

    public static void main(String[] args) {

        Animal elefante = new Elefante(500, "herbívoro", "andar");
        Animal aguia = new Aguia(20, "carnívoro", "voar");
        Animal lobo = new Lobo(85, "carnívoro", "andar");

        List<Animal> animalList = List.of(elefante, aguia, lobo);

        System.out.println("Animais que pesam menos que 50KG");
        Observable.fromStream(animalList.stream()).filter(animal -> animal.getPeso() < 50)
                .subscribe(element -> System.out.println(element));

        System.out.println("Animais que se locomovem andando");
        Observable.fromStream(animalList.stream()).filter(animal -> Objects.equals(animal.getLocomocao(), "andar"))
                .subscribe(element -> System.out.println(element));

        System.out.println("Animais carnívoros");
        Observable.fromStream(animalList.stream()).filter(animal -> Objects.equals(animal.getAlimentacao(), "carnívoro"))
                .subscribe(element -> System.out.println(element));

    }
}
