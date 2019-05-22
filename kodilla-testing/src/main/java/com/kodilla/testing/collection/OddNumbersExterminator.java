package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> listOfNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        return numbers;
    }

    public List<Integer> emptyList() {
        List<Integer> numbers = new ArrayList<>();
        return numbers;
    }

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> even = new ArrayList<>();
        for (Integer e : numbers) {
            if (e % 2 == 0) {
                even.add(e);
            }
        }
        return even;
    }
}
