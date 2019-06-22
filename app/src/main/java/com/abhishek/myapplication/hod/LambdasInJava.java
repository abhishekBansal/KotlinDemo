package com.abhishek.myapplication.hod;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdasInJava {

    Runnable lambda = () -> System.out.println("No argument No return lambda");
    Consumer<Integer> lambda1 = (arg1) -> System.out.println("One argument No return lambda");
    Function<Integer, Integer> lambda1Return = (arg1) -> arg1 * arg1;

    void main() {
        Runnable value0 = lambda;
        lambda.run();
//        lambda();

        Consumer<Integer> value1 = lambda1;
        value1.accept(2);

        Function<Integer, Integer> value2 = lambda1Return;
        value2.apply(2);

        Supplier<String> a = lambdaReturn();
        a.get();
    }


    Supplier<String> lambdaReturn() {
        String abc = "abc";
        return () -> abc;
    }
}
