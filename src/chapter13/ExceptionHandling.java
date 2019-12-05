package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        //createNewFile();
        numbersExceptionHandling(); 
    }

    private static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");

        try(Scanner fileReader = new Scanner(file)) {
            while(fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e){
            System.out.println("The file is not found");
            e.printStackTrace();
        }
    }

    public static void createNewFile(){
        File file = new File("resources/nonexist.txt");
        try {
            file.createNewFile();
        }catch (Exception e) {
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }

    public static void createNewFileRethrow() throws IOException{
        File file = new File("resources/nonexist.txt");
        file.createNewFile();

    }
}
