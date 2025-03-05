package com.rplbo.mathex;

public class Bagi extends OperatorNode {

    public Bagi(Node kiri, Node kanan) {
        super(kiri, kanan);
    }

    @Override
    public double hitung() {
        try{
            return getKiri().hitung() / getKanan().hitung();
        }
        catch (Exception e){
            System.out.println(e.toString());
            return 0;
        }
    }
}
