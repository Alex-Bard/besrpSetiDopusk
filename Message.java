package com.company;
import java.util.Random;

public class Message {
    private double Ppr;
    private double Pob;

    public Message(double Ppr,double Pob){
        this.Ppr = Ppr;
        this.Pob = Pob;
    }
    public boolean getNewResult(){
        boolean errorPr;
        boolean errorOb;
        double random1 = Math.random();
        double random2 = Math.random();
        if (random1 < this.Ppr){
            errorPr = true;
        }
        else{
            errorPr = false;
        }
        if (random2 < this.Pob){
            errorOb = true;
        }
        else{
            errorOb = false;
        }
        return getResult(errorPr, errorOb);
    }

    private boolean getResult(boolean ePr,boolean eOb){
        if (ePr || eOb){
            return false;
        }
        else return true;
    }
}
