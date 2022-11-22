package org.homework;

/*머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 
양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 
정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 
먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.*/

/*입출력 예 #1

10인분을 시켜 서비스로 음료수를 하나 받아 총 10 * 12000 + 3 * 2000 - 1 * 2000 = 124,000원입니다.

입출력 예 #2

64인분을 시켜 서비스로 음료수를 6개 받아 총 64 * 12000 + 6 * 2000 - 6 * 2000 =768,000원입니다.*/

//양꼬치
class Solution5 {
 public int solution(int n, int k) {
     int answer = 0;
     final int money =12000; 	// 양꼬치 가격 고정!
     for(int i=0; i<=n; i++) {
     	int y = i*money; 	 	// i에 n(인분) 을 반복해 반복한 만큼 몇 인분 먹었는지 계산
     	if(i%10==0 && i!=0) {	// 10인분당 음료수 서비스1개 조건문을 주어 10개당 음료수 하나씩 감소; 
     		k--;
     	}
     	for(int j=0; j<=k; j++) {
     		int b = k*2000;     // 입력되는 음료수 수만큼 계산
     		answer =y+b;		// 계산된 양꼬치와 음료 함산결과 담기 
     	}
     }
     
     return answer;
 }
 public static void main(String[] args) {
	 Solution5 h = new Solution5();
		System.out.print(h.solution(10,3));
	}
}
// 출력
// 124000
