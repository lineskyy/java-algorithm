package org.java.hom01;

import java.util.Scanner;

class WordGameApp {
   public Player[] pArr;
   public String word ="아버지";
   
   
   public static final Scanner scan = new Scanner(System.in);
   private int size = 0;
   
   public void getWordFromUser() {
	  String last_word = word;
		word = scan.next();
   }

   public WordGameApp() {
      System.out.println(":::: 끝말잇기 게임 ::::");
   }
   
   public void run() {
	   
	   
      System.out.println("==> game 시작 ... ");
      System.out.print("참가자 수를 입력 하세요. >> ");
      size = scan.nextInt();
      pArr = new Player[size];
      
      for(int i=0; i<pArr.length; i++) {
    	  System.out.print("참가자 이름 입력 ("+i+") :");
    	  String userName = scan.next();
    	  pArr[i] = new Player(userName);
    	  
      }
      
      
           // 첫 번째 문자
      
      System.out.print("시작하는 단어는 " + word + " 입니다.");
      int lastIndex = word.length() - 1;
	  char lastChar = word.charAt(lastIndex);
	  char firstChar = word.charAt(0);    
      
      
      // 누구 차례인지
      while(true) {
	      for(int j =0; j<pArr.length; j++) {
	    	  System.out.print("\n("+pArr[j].userName+")차례 입니다\n");
	    	  System.out.print("단어를 입력하세요 :");
	    	  String userName1 = scan.next();
	    	  pArr[j] = new Player(userName1);
    	  // 검열
	    	  if (!(lastChar != firstChar)) {
	  			System.out.println(pArr[j].userName + "이 졌습니다.");
	  			System.exit(lastChar);
	  		}
    	break;
    	  
          
      }
      }
   }
   
}

class Player {
   //public Player name;
   public String userName;
   public String userName1;
   
 public Player(String userName) {
      this.userName = userName;
   }

public void Player1(String userName1) {
	      this.userName1 = userName1;
	   }
 


}

public class Homegame {
   public static void main(String[] args) {
      new WordGameApp().run();
   }

}