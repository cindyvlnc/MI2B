/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

/**
 *
 * @author ASUS
 */
public class Account {
    String AccountName;
    int AccountNum;
    int Balance;
    int Deposit;
    int Tarik;

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    public int getAccountNum() {
        return AccountNum;
    }

    public void setAccountNum(int AccountNum) {
        this.AccountNum = AccountNum;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    public int getDeposit() {
        return Deposit;
    }

    public void setDeposit(int Deposit) {
        this.Deposit = Deposit;
    }

    public int getTarik() {
        return Tarik;
    }

    public void setTarik(int Tarik) {
        this.Tarik = Tarik;
    }

    

    
    void print(){
        
        System.out.println("Nama Nasabah: "+AccountName+"\nNo Rekening : "+AccountNum+"\nSaldo : "+Balance);
        
    }
    
    
}
