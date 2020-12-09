package com.company;
import java.util.Scanner;

public class dopusk1 {
    static Scanner in = new Scanner(System.in);
    static double Ppr,Pob;
    static int tau,n,cx,a,b,s,d;

    static private double askPpr(){
        System.out.print("Введите Ppr:");
        return in.nextDouble();
    }
    static private double askPob(){
        System.out.print("Введите Pob:");
        return in.nextDouble();
    }
    static private int askTau(){
        System.out.print("Введите tau:");
        return in.nextInt();
    }
    static private int askN(){
        System.out.print("Введите n:");
        return in.nextInt();
    }
    static private int askTests(){
        System.out.print("Введите количество проверок:");
        return in.nextInt();
    }
    public static void runDopusk1(){
        KanalD123 r = new KanalD123(askPpr(), 0, 0, askTests());
        System.out.print(r);
    }
    public static void runDopusk2(){
        KanalD123 r = new KanalD123(askPpr(), 0, askN(), askTests());
        System.out.print(r);
    }
    public static void runDopusk3(){
        KanalD123 r = new KanalD123(askPpr(), askPob(), askN(), askTests());
        System.out.print(r);
    }
    public static void runDopusk4(){
        KanalD4 r = new KanalD4(askPpr(), 0, askTests(), askTau());
        System.out.print(r);
        r.printPoins();
    }
    public static void runDopusk5(){
        KanalD5 r = new KanalD5(askPpr(), 0, askTests(), askTau());
        System.out.print(r);
        r.printPoins();
    }

}
