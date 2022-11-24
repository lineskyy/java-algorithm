package org.java.ex03;

public class ex03_10 {
	public static void main(String[] args) {
		  int num[][] = new int[4][4];
		  int cnt=0;
		  for(; cnt<10;) {
			  int i = (int)(Math.random()*4);
			  int j = (int)(Math.random()*4);
			  if(num[i][j]==0) {
				  num[i][j] = (int)(Math.random()*10+1);
				  cnt++;
			  }
			  for(int p=0; cnt<num.length; cnt ++) {
				  for(int t=0; cnt<num[p].length; cnt ++) {
					  System.out.print(num[p][t]+"  ");
				  }
				  System.out.println();
			  }
		  }
		  
	}	
}
			