package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> listOfNumbers(){
        List<Integer> numbers = new ArrayList<>();
        Random generator = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(generator.nextInt(50) + 1);
        }
        return numbers;
    }

   public List<Integer>  exterminate(ArrayList<Integer> numbers){
       List<Integer> even = new ArrayList<>();
       for (Integer e : numbers) {
           if (e % 2 == 0) {
               even.add(e);
           }
       }
       return even;
   }
}
