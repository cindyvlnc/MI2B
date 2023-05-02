/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Deposit {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int p;
        Account a2 =  new Account();
        a2.setAccountName("Dayat");
        a2.setAccountNum(2101092004);
        
        System.out.println("Anda mau melakukan transaksi : ");
        System.out.println("1. Penarikan \n2. Deposit \n3. Informasi Saldo");
        System.out.print("Pilihan : ");
        p = s.nextInt();
        switch (p){
            case 1:
                a2.setDeposit(100000);
                break;
            case 2:
                a2.setTarik(50000);
                break;
            case 3:
                a2.setBalance(54000);
                break;
                
        }
          
        
        
    }
    
}
