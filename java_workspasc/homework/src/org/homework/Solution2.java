package org.homework;

/*정수 배열 numbers가 매개변수로 주어집니다.
 numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 
 return하도록 solution 함수를 완성해주세요.*/

/*입출력 예 #1
[1, 2, 3, 4, 5]
두 수의 곱중 최댓값은 4 * 5 = 20 입니다.

입출력 예 #1
[0, 31, 24, 10, 1, 9]
두 수의 곱중 최댓값은 31 * 24 = 744 입니다..*/

//최댓값 만들기 (1)
class Solution2 {
 public int solution(int[] numbers) {
     int answer = 0; // 결과를 담을 변수
     int seccond =0; // 두번째 크기를 담을 변수
     int max=0; 	 // 최대 크기를 담을 변수 
     
     for(int i=0; i< numbers.length; i++) {
     	if(numbers[i]>max) {   // 최대 크기 를 구하는 알고리즘
     		seccond=max;	   // second 에는 numbers[i] 가 담겨있다.
     		max = numbers[i];
     	}else if (seccond<numbers[i] && seccond!=max) {
     		seccond = numbers[i]; // 두번째 큰값 구하기
     		
     	}
     }
     answer = max*seccond; //결과
     return answer;
     
 }
 public static void main(String[] args) {
	 Solution2 h = new Solution2();
 	int[] o = {1, 2, 3, 4, 5};
 	System.out.print(h.solution(o));
 }
     		
}
// 출력
// 744