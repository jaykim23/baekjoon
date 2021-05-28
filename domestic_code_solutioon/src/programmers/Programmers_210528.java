package programmers;

import java.util.Arrays;

public class Programmers_210528 {
	// 출처 : https://programmers.co.kr/learn/courses/30/lessons/12933
	//함수 solution은 정수 n을 매개변수로 입력받습니다. 
	//n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
	//예를들어 n이 118372면 873211을 리턴하면 됩니다.
	class Solution {
	    public long solution(long n) {
	        String num = String.valueOf(n);
			String strAnswer = "";
			char[] arr = new char[num.length()];
			for(int i=0;i<arr.length;i++) {
				arr[i] = num.charAt(i);
			}
			
			Arrays.sort(arr);
			for(int i=arr.length-1;i>=0;i--) {
				strAnswer += arr[i];
			}
			
			long answer = Long.parseLong(strAnswer);
	        return answer;
	    }
	}
}
