package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class KanalD4 extends Kanal{
    int[] Npoints;
    int[] Tpoints;
    int tau;
    public KanalD4(double Ppr, double Pob, int n, int tau){
        super(Ppr, Pob, n);
        this.tau = tau;
    }
    public double runTest(){
        int[] N = new int[this.n];
        int[] T = new int[this.n];
        int counter = this.n;
        int tmp1 = 0, tmp2 = 0;
        for (int i = 0; i < counter; i++){
            result res = this.logic();
            tmp1 = T[i] = tmp1 + res.getT();
            tmp2 = N[i] = tmp2 +res.getN();
        }
        this.Npoints = N;
        this.Tpoints = T;
        return (double) N[this.n-1]/(double) T[this.n-1];
    }
    public void printPoins(){
        System.out.print("Временные точки работы алгоритма:\n" + "Количество принятых сообщений - "
                + Arrays.toString(this.Npoints) +"\n" + "Моменты времени -               "
                + Arrays.toString(this.Tpoints) + "\n" );
    }

    private result logic() {
        int t = 0, n = 0;
        Message m = new Message(this.Ppr, this.Pob);
        t += 1 + this.tau;
        if (m.getNewResult()) {
            n++;
        }
        return new result(n, t);
    }
    @Override
    public String toString() {
        return "коэффицент использования канала для агоритма с ожиданием - " + this.runTest() + "\n";
    }
}
