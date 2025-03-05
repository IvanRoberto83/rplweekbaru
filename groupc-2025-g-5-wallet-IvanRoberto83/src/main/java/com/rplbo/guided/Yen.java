package com.rplbo.guided;

public class Yen extends Currency{
   //atribut
   private double value;

    public Yen(double value){
        this.value = value;
    }

    @Override
    public double toUSD() {
     return this.value / 149.77;
    }

    @Override
    public double toRupiah() {
     return this.value * 0.0091;
    }

    @Override
    public double toWon() {
     return this.value * 0.1;
    }

    @Override
    public double toYen() {
     return this.value;
    }
}
