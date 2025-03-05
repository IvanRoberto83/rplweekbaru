package com.rplbo.guided;

public class Won extends Currency{
    //atribut
    private double value;

    public Won(double value){
        this.value = value;
    }
    @Override
    public double toUSD() {
        return this.value / 1456;
    }

    @Override
    public double toRupiah() {
        return this.value * 0.089;
    }

    @Override
    public double toWon() {
        return this.value;
    }

    @Override
    public double toYen() {
        return this.value / 200.21;
    }
}
