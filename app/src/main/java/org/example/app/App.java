package org.example.app;

import org.apache.commons.lang3.StringUtils;
import org.example.list.LinkedList;
import static org.example.utilities.StringUtils.join;
import static org.example.utilities.StringUtils.split;
import static org.example.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {

        LinkedList tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));

        String text = "Hello world";
        System.out.println(StringUtils.reverse(text));

        System.out.println(getMessage());
    }
}