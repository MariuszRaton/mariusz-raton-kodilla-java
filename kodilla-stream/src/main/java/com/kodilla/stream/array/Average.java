package com.kodilla.stream.array;

import java.util.stream.IntStream;

public class Average implements ArrayOperations {

    private double result;

    public double getResult() {
        return result;
    }

    @Override
    public void getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        result = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();

        System.out.println(result);
    }
}
