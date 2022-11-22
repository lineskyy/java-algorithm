package org.homework;

import java.util.Arrays;

/*문자열 배열 strlist가 매개변수로 주어집니다. 
strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를 완성해주세요.*/

/*입출력 예 #1

["We", "are", "the", "world!"]의 각 원소의 길이인 [2, 3, 3, 6]을 return합니다.
입출력 예 #2

["I", "Love", "Programmers."]의 각 원소의 길이인 [1, 4, 12]을 return합니다.*/

//배열 원소의 길이
class Solution4 {
	public int[] solution(String[] strlist) {
	   int[] answer = new int[strlist.length]; // strlist의 길이만큼 int 배열 생성
	   for(int i=0; i<strlist.length;i++) {
	   	answer[i] =strlist[i].length(); 	   // 정수배열(answer[i]) 에 문자열의 길이를 저장
	   }
	   return answer;
	}
	public static void main(String[] args) {
		Solution4 s4 =new Solution4();
		String[] k = {"We", "are", "the", "world!"};
 		System.out.print(Arrays.toString(s4.solution(k)));
	}
}
// 출력
// [2, 3, 3, 6]