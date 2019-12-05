package chapter13;

import java.io.File;

public class ExceptionHandling {
    public static void main(String[] args) {

        createNewFile();
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
}
