package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public String beautify(String exampleString, PoemDecorator decorateString) {
        return decorateString.decorate(exampleString);
    }
}
