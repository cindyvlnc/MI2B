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
public class TestBank {
    public static void main(String[] args){
        Account a2 = new Account();
        Account a3 = new Account();
      
        
        a2.setAccountName("Dayat");
        a2.setAccountNum(2101092044);
        a2.setBalance(50000);
        
        a3.setAccountName("Dizky");
        a3.setAccountNum(2101092045);
        a3.setBalance(10000);
        
        a2.print();
        a3.print();
        
        
        
        
    }
    
}
