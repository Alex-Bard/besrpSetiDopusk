package com.company;

public class Kanal {
    double Ppr;
    double Pob;
    int n;

    public Kanal(double Ppr, double Pob, int n){
        this.Ppr = Ppr;
        this.Pob = Pob;
        this.n = n;
    }
    //int logic();

    public double getPpr(){
        return this.Ppr;
    }
    public double getPob(){
        return this.Pob;
    }
    public int getN(){
        return this.n;
    }
}
