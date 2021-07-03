package programmers;

public class Programmers_210703 {
	// 출처 : https://programmers.co.kr/learn/courses/30/lessons/77884
	//	두 정수 left와 right가 매개변수로 주어집니다. 
	//	left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 
	//	약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
	 public int solution(int left, int right) {
	        int answer = 0;
	        
	        //약수의 갯수가 짝수 홀수 인것을 가진 수
	        for(int i = left; i <= right; i++) {
	        	//약스위 갯수를 세는 변수
	            int count = 0;
	            //i부터 j까지 돌린다. j=1인이유는 약수는 0이 될 수 없기 때문
	            for(int j = 1; j <= i; j++) {
	            	//짝수 개면 count 증가
	                if(i % j == 0) {
	                	count++;
	                }
	            }
	            //count가 짝수면 답에 더한다.
	            if(count % 2 == 0) {
	            	answer += i;
	            //홀수일 경우 뺀다.
	            }else {
	            	answer -= i;
	            }
	        }
	        //리턴한다.
	        return answer;
	    }
}
