package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Введите номер допуска:");
            switch (in.nextInt()) {
                case 1:
                    dopusk1.runDopusk1();
                    break;
                case 2:
                    dopusk1.runDopusk2();
                    break;
                case 3:
                    dopusk1.runDopusk3();
                    break;
                case 4:
                    dopusk1.runDopusk4();
                    break;
                case 5:
                    dopusk1.runDopusk5();
                    break;
                default:
                    System.out.print("Введите номер допуска (0 - 5)");
            }
        }

    }
}
