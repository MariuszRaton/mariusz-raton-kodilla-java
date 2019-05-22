package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemExample = new PoemBeautifier();
        String text1 = poemExample.beautify("cos", t -> t.toUpperCase());
        System.out.println(text1);

        String text2 = poemExample.beautify("Loren Ipsum", t -> ":-) " + t + " :-)");
        System.out.println(text2);

        String text3 = poemExample.beautify(" M a r i u s z ", t -> t.replace(" ", ""));
        System.out.println(text3);

        String text4 = poemExample.beautify("LoRen IpsUm", t -> t.toLowerCase());
        System.out.println(text4);

   /* 7.3
        Forum forumUsers = new Forum();
        LocalDate now = LocalDate.now();
        Map<Integer, ForumUser> map = forumUsers.getList().stream()
                .filter(user -> user.getGender() == 'M' )
                .filter(user -> user.getDateOfBirth().isBefore(now.minusYears(20)))
                .filter(user -> user.getPostsOfPublished() > 1)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        System.out.println("# elements: " + map.size());
        map.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

*/
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