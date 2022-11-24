package org.homework;

/*문자열 my_string이 매개변수로 주어집니다.
my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.*/

/*입출력 예 #1

my_string이 "jaron"이므로 거꾸로 뒤집은 "noraj"를 return합니다.
입출력 예 #2

my_string이 "bread"이므로 거꾸로 뒤집은 "daerb"를 return합니다.*/

// 문자열 뒤집기
class Solution11 {
	public String solution(String my_string) {
		String answer = "";
		for(int i=my_string.length()-1; i>=0; i--) {
			answer +=my_string.charAt(i);
		}
		return answer;
	}
}
//테스트 1
//입력값 〉	"jaron"
//기댓값 〉	"noraj"
//실행 결과 〉	테스트를 통과하였습니다.
//테스트 2
//입력값 〉	"bread"
//기댓값 〉	"daerb"
//실행 결과 〉	테스트를 통과하였습니다.
