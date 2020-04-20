package org.example;

import java.util.HashMap;
import java.util.Map;

public class Morse {

    public static Map<Character, String> translateToMorse = new HashMap<Character, String>();
    public static Map<String, Character> translateFromMorse = new HashMap<String, Character>();

    public static void main(String[] args) {
        init();
        for(String str : args) {
            str = str.toLowerCase();
            if(str.matches("^[a-z0-9 ]*$")) {
                String[] words = str.split(" ");
                StringBuilder sb = new StringBuilder();
                for(String s : words)  {
                    sb.append(toMorse(s) + "   ");
                }
                System.out.println(sb.toString());
            } else {
                String[] words = str.split("   ");
                StringBuilder sb = new StringBuilder();
                for( String s : words ) {
                    sb.append(fromMorse(s) + " ");
                }
                System.out.println(sb.toString());
            }
        }
    }

    public static void init() {
        translateToMorse.put('a', ".-");
        translateFromMorse.put(".-", 'a');
        translateToMorse.put('b', "-...");
        translateFromMorse.put("-...", 'b');
        translateToMorse.put('c', "-.-.");
        translateFromMorse.put("-.-.", 'c');
        translateToMorse.put('d', "-..");
        translateFromMorse.put("-..", 'd');
        translateToMorse.put('e', ".");
        translateFromMorse.put(".", 'e');
        translateToMorse.put('f', "..-.");
        translateFromMorse.put("..-.", 'f');
        translateToMorse.put('g', "--.");
        translateFromMorse.put("--.", 'g');
        translateToMorse.put('h', "....");
        translateFromMorse.put("....", 'h');
        translateToMorse.put('i', "..");
        translateFromMorse.put("..", 'i');
        translateToMorse.put('j', ".---");
        translateFromMorse.put(".---", 'j');
        translateToMorse.put('k', "-.-");
        translateFromMorse.put("-.-", 'k');
        translateToMorse.put('l', ".-..");
        translateFromMorse.put(".-..", 'l');
        translateToMorse.put('m', "--");
        translateFromMorse.put("--", 'm');
        translateToMorse.put('n', "-.");
        translateFromMorse.put("-.", 'n');
        translateToMorse.put('o', "---");
        translateFromMorse.put("---", 'o');
        translateToMorse.put('p', ".--.");
        translateFromMorse.put(".--.", 'p');
        translateToMorse.put('q', "--.-");
        translateFromMorse.put("--.-", 'q');
        translateToMorse.put('r', ".-.");
        translateFromMorse.put(".-.", 'r');
        translateToMorse.put('s', "...");
        translateFromMorse.put("...", 's');
        translateToMorse.put('t', "-");
        translateFromMorse.put("-", 't');
        translateToMorse.put('u', "..-");
        translateFromMorse.put("..-", 'u');
        translateToMorse.put('v', "...-");
        translateFromMorse.put("...-", 'v');
        translateToMorse.put('w', ".--");
        translateFromMorse.put(".--", 'w');
        translateToMorse.put('x', "-..-");
        translateFromMorse.put("-..-", 'x');
        translateToMorse.put('y', "-.--");
        translateFromMorse.put("-.--", 'y');
        translateToMorse.put('z', "--..");
        translateFromMorse.put("--..", 'z');
        translateToMorse.put('/', "-..-.");
        translateFromMorse.put("-..-.", '/');
        translateToMorse.put(':', "---...");
        translateFromMorse.put("---...", ':');
        translateToMorse.put('.', ".-.-.-");
        translateFromMorse.put(".-.-.-", '.');
    }

    public static String toMorse(String word) {
        word = word.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c : word.toCharArray()) {
            sb.append(translateToMorse.get(c) + " ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static String fromMorse(String word) {
        StringBuilder sb = new StringBuilder();
        for(String s : word.split(" ")) {
            sb.append(translateFromMorse.get(s));
        }
        return sb.toString();
    }
}
