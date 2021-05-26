package programmers;

public class Programmers_210517 {

	class Solution {
		public boolean solution(String s) {
			
//			https://programmers.co.kr/learn/courses/30/lessons/12918
//			문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
//			예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
			
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