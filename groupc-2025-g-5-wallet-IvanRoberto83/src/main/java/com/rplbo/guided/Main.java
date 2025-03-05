package com.rplbo.guided;

public class Main {
    public static void main(String[] args) {
        Rupiah r = new Rupiah(33000); // 2 dollar
        Yen y = new Yen(1000); // 6,68 dollar
        Won w = new Won(5000); // 3,43 dollar
        DollarWallet dw = new DollarWallet();

        dw.insertMoney(r);
        dw.insertMoney(y);
        dw.insertMoney(w);

        dw.expenseMoney(new Rupiah(16500));

        dw.printMoney();
    }
}
