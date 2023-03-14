/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuanke3;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

class Genshin {
  String username = "ai-chan";
  String cekGenshin() { 
    return "Ini berasal dari class Genshin"; 
  }
};
 
class Character extends Genshin {
  String chara1="hutao";
  String chara2="mona";
  String cekCharacter() { 
    return "Ini berasal dari class Character"; 
  }
};
 
class Tugas {
  public static void main(String args[]){
    Character CharacterCindy = new Character();
    Scanner input = new Scanner(System.in);
    int level;
    System.out.println(CharacterCindy.username);
    System.out.print("masukkan level : ");
    level = input.nextInt();
    int n=4,i;
    
    if (level>=30){
        for(i=0;i<n;i++){
        System.out.println(CharacterCindy.chara1);}
    }
    else{
        for(i=0;i<n;i++){
        System.out.println(CharacterCindy.chara2);}
    }
    System.out.println(CharacterCindy.cekGenshin());
    System.out.println(CharacterCindy.cekCharacter());
  }
}
