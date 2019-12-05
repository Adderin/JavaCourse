package chapter14;

import java.util.Objects;
import java.util.Scanner;

public class CoinTossGame {

    private Scanner scanner;

    public static void main(String[] args) throws InterruptedException {
        CoinTossGame game = new CoinTossGame();
        game.scanner = new Scanner(System.in);

        Player player1 = new Player(game.askName());
        player1.setGuess(game.askGuess());

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
        System.out.println("\nВыпала " + coin.getSide());
        Thread.sleep(2000);

        game.determineWinner(player1, player2, coin);


        game.scanner.close();

    }
    private String askName(){
        System.out.println("Введите свое имя: ");
        return scanner.nextLine();
    }

    private String askGuess(){
        System.out.println("Введите Орел или Решка: ");
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
