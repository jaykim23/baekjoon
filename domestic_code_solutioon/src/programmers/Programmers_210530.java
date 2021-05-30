package programmers;

public class Programmers_210530 {
	//출처 : https://programmers.co.kr/learn/courses/30/lessons/76501#
	//어떤 정수들이 있습니다. 
	//이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 
	//이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다. 
	//실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
	class Solution {
	    public int solution(int[] absolutes, boolean[] signs) {
	        //리턴할 answer 선언
	    	int answer = 0;
	    	//signs로 판별하여 false일 경우 곱해서 음수로 만든다.
	        int minus = -1;
	        //absolutes의 길이 만큼 돌린다.
	        for(int i=0;i<absolutes.length;i++) {
				//sign[i]가 false일 경우에는 absolutes[i]에 minus를 곱한다.
	        	if(signs[i] == false) {
					absolutes[i] = absolutes[i] * minus;
				}
			}
			//absolute의 값을 더한다.
			for(int i =0;i<absolutes.length;i++) {
				answer = answer + absolutes[i];
			}
	        //리턴한다.
	        return answer;
	    }
	}
//	public static void main(String[] args) {
//		int[] absolutes = {1,2,3};
//		boolean[] sign = {false, false, true};
//		int minus = -1;
//		int answer = 0;
//		
//		for(int i=0;i<absolutes.length;i++) {
//			if(sign[i] == false) {
//				absolutes[i] = absolutes[i] * minus;
//			}
//		}
//		
//		for(int i =0;i<absolutes.length;i++) {
//			answer = answer + absolutes[i];
//		}
//		
//		System.out.println(answer);
//		
//		
//	}
}
