package org.java.hom01;

import java.util.Scanner;

class WordGameApp {
   public Player[] pArr;
   public String word ="�ƹ���";
   
   
   public static final Scanner scan = new Scanner(System.in);
   private int size = 0;
   
   public void getWordFromUser() {
	  String last_word = word;
		word = scan.next();
   }

   public WordGameApp() {
      System.out.println(":::: �����ձ� ���� ::::");
   }
   
   public void run() {
	   
	   
      System.out.println("==> game ���� ... ");
      System.out.print("������ ���� �Է� �ϼ���. >> ");
      size = scan.nextInt();
      pArr = new Player[size];
      
      for(int i=0; i<pArr.length; i++) {
    	  System.out.print("������ �̸� �Է� ("+i+") :");
    	  String userName = scan.next();
    	  pArr[i] = new Player(userName);
    	  
      }
      
      
           // ù ��° ����
      
      System.out.print("�����ϴ� �ܾ�� " + word + " �Դϴ�.");
      int lastIndex = word.length() - 1;
	  char lastChar = word.charAt(lastIndex);
	  char firstChar = word.charAt(0);    
      
      
      // ���� ��������
      while(true) {
	      for(int j =0; j<pArr.length; j++) {
	    	  System.out.print("\n("+pArr[j].userName+")���� �Դϴ�\n");
	    	  System.out.print("�ܾ �Է��ϼ��� :");
	    	  String userName1 = scan.next();
	    	  pArr[j] = new Player(userName1);
    	  // �˿�
	    	  if (!(lastChar != firstChar)) {
	  			System.out.println(pArr[j].userName + "�� �����ϴ�.");
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