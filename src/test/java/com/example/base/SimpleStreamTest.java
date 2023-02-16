package com.example.base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStreamTest {

    @Test
    void limit() {
        Stream<Integer> infinito = Stream.iterate(0, i -> i + 3);

        List<Integer> result = infinito
                .limit(4)
                .collect(Collectors.toList());

        Assertions.assertEquals(List.of(0, 3, 6, 9), result);
    }

    @Test
    void limit_reduce(){
        Stream<Integer> infinito = Stream.iterate(0, i -> i + 3);

        Integer result = infinito
                .limit(4)
                .reduce((a,b) -> a + b)
                .orElse(1);

        Assertions.assertEquals(18, result);
    }
}
