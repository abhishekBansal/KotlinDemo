package com.abhishek.myapplication.hod;

import androidx.core.util.Pair;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HigherOrderFunctionJava {

    private void normalFun(int a, int b) {
        System.out.println(a + b);
    }

    // Method as Parameter
    String action(String str, Function<String, String> action) {
        if (str.length() > 3) {
            return action.apply(str);
        } else {
            return str;
        }
    }

    // Method as return type
    private BiConsumer<Integer, Integer> action() {
        return this::normalFun;
    }

    // Consuming Method as Return type
    void helper() {
        action().accept(10, 30);
    }


    Optional<String> doSomethingAlso(List<String> elements) {
        Map<String, List<String>> map = elements.stream()
                .collect(Collectors.groupingBy(String::toString));
        return map.entrySet().stream()
                .map(x -> {
                    Pair<String, Integer> pair = new Pair<>(x.getKey(), x.getValue().size());
                    return pair;
                }).filter(x -> x.second % 2 == 0)
                .filter(x -> x.first.startsWith("a"))
                .map(x -> x.first)
                .findFirst();
    }
}
