package programmers;

public class Programmers_210701 {
	// 출처 : https://programmers.co.kr/learn/courses/30/lessons/12934
	//	임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
	//	n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, 
	//	n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
	 public long solution(long n) {
	        long answer = 0;
	        //주어진 수 n까지 i를 제곱한다. 같은 경우 제곱근
	        for (long i = 1; i <= n; i++) { 
	        	//같을 때 answer에 i+1을 넣는다.
	            if (i * i == n) { 
	                answer = (i + 1) * (i + 1); 
	                break; 
	            } 
	            //아닌경우 -1리턴
	            else answer = -1; 
	        }
	        //리턴한다.
	        return answer;
	    }
}
