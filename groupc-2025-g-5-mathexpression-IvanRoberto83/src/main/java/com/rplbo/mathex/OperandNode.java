package com.rplbo.mathex;

public class OperandNode extends Node{
    private double angka;
    @Override
    public double hitung() {
        return angka;
    }

    public OperandNode(double angka) {
        this.angka = angka;
    }
}
