package com.company;

public class KanalD5 extends KanalD4 {
    public KanalD5(double Ppr, double Pob, int n, int tau){
        super(Ppr, Pob, n, tau);
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
    private result logic() {
        int t = 0, n = 0;
        Message m = new Message(this.Ppr, this.Pob);
        t += 1;
        if (m.getNewResult()) {
            n++;
        }
        else {
            t+= this.tau;
        }
        return new result(n, t);
    }

    @Override
    public String toString() {
        return "коэффицент использования канала для агоритма возвратом - " + this.runTest() + "\n";
    }
}
