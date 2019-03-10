package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;

import java.time.LocalDate;

public class StreamMain {


    public static void main(String[] args) {
        Forum forumUsers = new Forum();
        forumUsers.getList().stream()
               // .filter(user -> user.getGender() == 'M' )
                .filter(user -> user.getDateOfBirth() > equals(LocalDate.of(1999,03,10)))
               // .filter(user -> user.getDateOfBirth() <= LocalDate.of(1999,03,10))
                //               // .equals("M")   musze użyć isBefore
                .forEach(System.out::println);




 /* 7.2
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
*/
    }

}