package programmers;

public class programmers_210517 {

	class Solution {
		public boolean solution(String s) {
	        char temp;	
	        boolean answer = true;
	        //길이 비교
	        if(s.length() == 4 || s.length() == 6){
	            
	        }else{
	            answer = false;
	            return answer; 
	        }
				//주어진 문자열의 길이만큼 반복문 진행
				for (int i = 0; i < s.length(); i++) {
					//글자 하나씩 비교
					temp = s.charAt(i);
					//문자열이 숫자가 아닐 경우
					if (Character.isDigit(temp) == false) {
						//답을 거짓으로 설정
						answer = false;
					}
				}
				//리턴
	            return answer;
	    }
	}
}