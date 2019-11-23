package chapter8;

public class TextProcessor {

    public static void main(String[] args){
        countWords("I love my University");
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
}
