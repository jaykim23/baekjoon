package programmers;

public class Programmers_210527 {
	// 출처 : https://programmers.co.kr/learn/courses/30/lessons/12931?language=java
	// 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
	// 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

	public int solution(int n) {
		//답에 대한 변수 선언
		int answer = 0;
		
		//주어진 변수의 크기가 0보다 클경우에 까지 돌아가도록
		while(n>0) {
			//10을 나누고 나머지를 구하면 1의자리가 나온다.
			answer += n % 10;
			//그리고 그걸 실제적으로 나눈다. 이렇게 되면 10의자리의 수를 구할 수 있다.
			n = n / 10;
			//이를 반복한다
		}
	    //값을 보낸다
		return answer;
	      
    }
}

