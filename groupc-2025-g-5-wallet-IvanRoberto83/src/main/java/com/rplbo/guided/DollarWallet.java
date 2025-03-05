package com.rplbo.guided;

public class DollarWallet extends Wallet {

    @Override
    public void insertMoney(Currency c) {
        double hasil = c.toUSD();
        this.setTotalUang(getTotalUang() + hasil);
    }

    @Override
    public void expenseMoney(Currency c) {
        double hasil = c.toUSD();
        if(getTotalUang() > hasil) {
            this.setTotalUang(getTotalUang() - hasil);
        }
        else{
            System.out.println("Uang Anda Kurang");
        }
    }

    @Override
    public void printMoney() {
        System.out.println("Uang : "+getTotalUang()+" dollar");
    }
}
