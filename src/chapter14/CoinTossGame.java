package chapter14;

import java.util.Objects;
import java.util.Scanner;
import java.lang.String;

public class CoinTossGame {

    private Scanner scanner;
    int count = 1;

    public static void main(String[] args) throws InterruptedException {
        CoinTossGame game = new CoinTossGame();
        game.scanner = new Scanner(System.in);

        Player player1 = new Player(game.askName());
        player1.setGuess(game.askGuess(player1.getName()));

        Player player2 = new Player(game.askName());
        if(player1.getGuess().equalsIgnoreCase(Coin.HEADS)){
            player2.setGuess(Coin.TAILS);
        }else{
            player2.setGuess(Coin.HEADS);
        }
        System.out.print("Бросаем монетку.");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1500);

        Coin coin = new Coin();
        coin.flip();
        if(coin.getSide().equals("Орел")){
            System.out.println("\nВыпал " + coin.getSide());
        }
        else System.out.println("\nВыпала " + coin.getSide());
        Thread.sleep(2000);

        game.determineWinner(player1, player2, coin);

        game.scanner.close();
    }
    private String askName(){
        System.out.println("Введите свое имя, игрок#"+count+": ");
        count++;
        return scanner.nextLine();
    }

    private String askGuess(String name){
        System.out.printf("Что выбираешь, %s: Орел или Решка?\n",name);
        String choice = scanner.nextLine();
        while (!Objects.equals(choice, Coin.HEADS) && !Objects.equals(choice, Coin.TAILS)) {
            System.out.println("Ошибка. Введите Орел или Решка: ");
            choice = scanner.nextLine();
        }
    return choice;
    }

    private void determineWinner(Player player1, Player player2, Coin coin){
        String winner;
        if(coin.getSide().equalsIgnoreCase(player1.getGuess())){
            winner = player1.getName();
        }else{
            winner = player2.getName();
        }

        System.out.println("В этой игре побеждает - " + winner);
    }
}
