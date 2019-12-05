package chapter14;

import java.util.Random;

public class Coin {
    public static String HEADS = "Решка";
    public static String TAILS = "Орел";
    private String side;

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void flip(){
        if(new Random().nextBoolean()){
            setSide(HEADS);
        }
        else{
            setSide(TAILS);
        }

    }
}
