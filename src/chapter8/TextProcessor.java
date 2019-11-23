package chapter8;

import java.util.Scanner;

public class TextProcessor {

    public static String sentence;

    public static void main(String[] args){
        System.out.println("Please write your jumbled sentence below:");
        Scanner scanner = new Scanner(System.in);
        sentence = scanner.nextLine();
        scanner.close();
        String str = addSpaces(sentence);
        countWords(str);
        reverseString(str);
    }

    /**
     * Adds spaces before each uppercase letter
     * @param string jumbled text
     */
    private static String addSpaces(String string) {

        var modifiedText = new StringBuilder(string);

        for(int i = 0; i < modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        var str = modifiedText.toString();
        return str;
        //System.out.println(modifiedText);
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

        String message = String.format("Your sentence \'%s\' contains %d words", addSpaces(sentence), numberOfwords);
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

