package org.homework;

/*정수 배열 numbers가 매개변수로 주어집니다. 
numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.*/

/*입출력 예 #1

numbers의 원소들의 평균 값은 5.5입니다.
입출력 예 #2

numbers의 원소들의 평균 값은 94.0입니다.*/

//배열의 평균
public class Solution6 {
	public double solution(int[] numbers) {
		double answer = 0;
		for(int i=0; i<numbers.length; i++) {
			answer+=numbers[i];   // numbers[i] 의 값들은 더해 총합을 낸다.
		}
		return answer/numbers.length; // 총합과 numbers 길이로 나누어 평균  
	}
	public static void main(String[] args) {
		Solution6 s6 = new Solution6();
		int[] k= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(s6.solution(k));
	}
	
}
//테스트 1
//입력값 〉	[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//기댓값 〉	5.5
//실행 결과 〉	테스트를 통과하였습니다.
//테스트 2
//입력값 〉	[89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]
//기댓값 〉	94.0
//실행 결과 〉	테스트를 통과하였습니다.