package com.rplbo.mathex;

public class Main {
    public static void main(String[] args) {
        //5 + 3 + 6
        OperandNode o1 = new OperandNode(5);
        OperandNode o2 = new OperandNode(3);
        OperandNode o3 = new OperandNode(6);
        OperatorNode on1 = new Tambah(o1,o2);
        OperatorNode on2 = new Tambah(on1,o3);
        System.out.println("Tambah (5 + 3 + 6) : "+on2.hitung());

        //25 * 5
        OperandNode O1 = new OperandNode(25);
        OperandNode O2 = new OperandNode(5);
        OperatorNode On1 = new Kali(O1,O2);
        System.out.println("Kali (25 * 5) : "+On1.hitung());
    }
}
