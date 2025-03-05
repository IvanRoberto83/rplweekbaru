package com.rplbo.guided;

public class Rupiah extends Currency{
    //atribut
    private double value;

    public Rupiah(double value){
        this.value = value;
    }
    @Override
    public double toUSD() {
        return value / 16415;
    }

    @Override
    public double toRupiah() {
        return this.value;
    }

    @Override
    public double toWon() {
        return value / 11.27;
    }

    @Override
    public double toYen() {
       return value / 109.52;
    }
}
