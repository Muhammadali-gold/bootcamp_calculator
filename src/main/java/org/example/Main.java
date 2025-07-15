package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0 && Objects.equals(args[0], "guess_random")){
            int attempts = 0;
            while (true){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Guess :");
                String guess = scanner.nextLine();

                if (guess.equals("exit")){
                    System.out.println("Good bye!");
                    break;
                }

                int random_dice = (int) Math.floor(1 + Math.random() * 6);
                if (Integer.parseInt(guess) == random_dice){
                    System.out.println("You win! You attempted " + attempts + " times.");
                    System.out.println("Good bye!");
                    break;
                } else {
                    System.out.println("You lost! Random dice: "+random_dice);
                    attempts++;
                }
            }
        }
    }
}