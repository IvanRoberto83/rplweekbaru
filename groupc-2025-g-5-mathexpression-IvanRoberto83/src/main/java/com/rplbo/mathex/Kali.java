package com.rplbo.mathex;

public class Kali extends OperatorNode {

    public Kali(Node kiri, Node kanan) {
        super(kiri, kanan);
    }

    @Override
    public double hitung() {
        return getKiri().hitung() * getKanan().hitung();
    }
}
