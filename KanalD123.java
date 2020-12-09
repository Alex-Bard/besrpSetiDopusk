package com.company;
public class KanalD123 extends Kanal {
    private int tests;
    public KanalD123(double Ppr, double Pob, int n, int tests){
        super(Ppr, Pob, n);
        this.tests = tests;
    }
    public double runTest(){
        int Ntests = this.tests;
        double Nsr;
        int N = 0;
        while (Ntests != 0){
            N += logic();
            Ntests --;
        }
        return (double) N/(double) this.tests;
    }

    int logic(){
        int N = 1;
        Message m = new Message(this.Ppr, this.Pob);
        if (this.n == 0){
            while (!m.getNewResult()){
                N ++;
            }
        }
        else{
            for (int i = 0; i < this.n - 1; i++){
                if (!m.getNewResult()){
                    N ++;
                }
                else{
                    break;
                }
            }
        }
        return N;
    }
    @Override
    public String toString() {
        return "Среднее число передач - " + this.runTest() + "\n";
    }
}
