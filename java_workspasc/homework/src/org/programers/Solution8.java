package org.homework;

/*정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, 
array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.*/

/*입출력 예 #1

[1, 1, 2, 3, 4, 5] 에는 1이 2개 있습니다.

입출력 예 #2

[0, 2, 3, 4] 에는 1이 0개 있습니다.*/

//}중복된 숫자 개수
class Solution8 {
	public int solution(int[] array, int n) {
		int answer = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i]==n) {
				answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Solution8 s8=new Solution8();
		int[] k = {1, 1, 2, 3, 4, 5};
		System.out.println(s8.solution(k, 1));
	}
}
//테스트 1
//입력값 〉	[1, 1, 2, 3, 4, 5], 1
//기댓값 〉	2
//실행 결과 〉	테스트를 통과하였습니다.
//테스트 2
//입력값 〉	[0, 2, 3, 4], 1
//기댓값 〉	0
//실행 결과 〉	테스트를 통과하였습니다.
