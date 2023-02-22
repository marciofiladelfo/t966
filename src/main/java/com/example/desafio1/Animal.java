package com.example.desafio1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Animal {
    protected int peso;
    protected String alimentacao;
    protected String locomocao;
}
