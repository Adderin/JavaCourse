package chapter8;

import java.util.Scanner;

public class TextProcessor {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Please write your sentence below:");
        String sentence = scanner.nextLine();
        scanner.close();
        countWords(sentence);
        reverseString(sentence);
    }

    /**
     * Splits a String into an array of words
     * by tokenizing it.
     * Count words and prints them.
     * @param string Full string to be split
     */
    public static void countWords(String string){
        var words = string.split(" ");
        int numberOfwords = words.length;

        String message = String.format("Your sentence contains %d words", numberOfwords);
        System.out.println(message);

        for(int i = 0; i < numberOfwords; i++){
            System.out.print(words[i]+',');
        }
    }

    /**
     * Print a given string in reverse order
     * @param string String to reverse
     */
    public static void reverseString(String string) {
        System.out.println("\nYour reversed sentence is: ");
        for(int i=string.length()-1; i>=0;i--){
            System.out.print(string.charAt(i));
        }
    }
}

