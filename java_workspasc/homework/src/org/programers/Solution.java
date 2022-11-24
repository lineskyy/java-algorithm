package org.homework;

import java.util.Arrays;

/*정수가 담긴 리스트 num_list가 주어질 때, 
num_list의 원소 중 짝수와 홀수의 개수를 담은 
배열을 return 하도록 solution 함수를 완성해보세요.
배열의 짝수 홀수 개수*/

/*입출력 예 #1

[1, 2, 3, 4, 5]에는 짝수가 2, 4로 두 개, 홀수가 1, 3, 5로 세 개 있습니다.

입출력 예 #2

[1, 3, 5, 7]에는 짝수가 없고 홀수가 네 개 있습니다.*/

class Solution {
 public int[] solution(int[] num_list) {
     int[] answer = new int[2]; // 결과를 담을 배열
     int a=0;					// 홀과 짝 만 구하면 되기 때문에 2
     int b=0;
     
     for(int i=0; i<num_list.length; i++) {
     	if(num_list[i]%2==0) { // num_list[i] 짝수면 
     		a ++;              // a 증가
     	}else {				   // 아니면 (홀수면)
     		b++;			   // b 증가
     	}
     }
     answer[0] = a;  // answer 0번째 인데스에 결과값 저장
     answer[1] = b;  // answer 1번째 인데스에 결과값 저장
     return answer;  // 결과 반환
  }
 public static void main(String[] args) {
	Solution sl = new Solution();
	int[] k = {1, 3, 5, 7};
	System.out.print(Arrays.toString(sl.solution(k)));
 }
}
//출력
//[0, 4]