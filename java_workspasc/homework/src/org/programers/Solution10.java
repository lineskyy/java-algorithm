package org.homework;

import java.util.Arrays;

/*정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. 
num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.*/

/*입출력 예 #1
num_list가 [1, 2, 3, 4, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 4, 3, 2, 1]을 return합니다.

입출력 예 #2
num_list가 [1, 1, 1, 1, 1, 2]이므로 순서를 거꾸로 뒤집은 배열 [2, 1, 1, 1, 1, 1]을 return합니다.

입출력 예 #3
num_list가 [1, 0, 1, 1, 1, 3, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 3, 1, 1, 1, 0, 1]을 return합니다.*/

//}  배열 뒤집기
class Solution10 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];     // 결과를 담을 배열 생성
		for(int i=0; i<num_list.length; i++) {		  
			answer[i]=num_list[num_list.length-1-i]; // 반복 하면서 순서가 뒤바뀜 
		}
		return answer;
	}
	public static void main(String[] args) {
		Solution10 h = new Solution10();
		int[] j = {1, 1, 1, 1, 1, 2};
		System.out.print(Arrays.toString(h.solution(j)));
	}
}
//테스트 1
//입력값 〉	[1, 2, 3, 4, 5]
//기댓값 〉	[5, 4, 3, 2, 1]
//실행 결과 〉	테스트를 통과하였습니다.
//테스트 2
//입력값 〉	[1, 1, 1, 1, 1, 2]
//기댓값 〉	[2, 1, 1, 1, 1, 1]
//실행 결과 〉	테스트를 통과하였습니다.
//테스트 3
//입력값 〉	[1, 0, 1, 1, 1, 3, 5]
//기댓값 〉	[5, 3, 1, 1, 1, 0, 1]
//실행 결과 〉	테스트를 통과하였습니다.
