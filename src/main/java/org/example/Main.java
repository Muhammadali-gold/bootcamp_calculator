package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0 && Objects.equals(args[0], "random")){
            System.out.println("Random dice: "+ (int) (Math.floor(1 + Math.random() * 6)));
        }
    }
}