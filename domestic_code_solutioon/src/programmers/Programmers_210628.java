package programmers;



public class Programmers_210628 {
	//출처 : https://programmers.co.kr/learn/courses/30/lessons/12926
	//	어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
	//	예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 
	//	문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
	public String solution(String s, int n) { 
		String answer = "";
		//s글자만큼 잘라서 char ch에 넣는다.
		for(int i=0; i<s.length(); i++) { 
			char ch = s.charAt(i);
			//소문자일 경우
			if(Character.isLowerCase(ch)) {
				//ch에서 a만큼 빼고 n을 더하면 26의 나머지를 계산한여 넘어갔는지 여부를 체크하고 a를 더한다.
				ch = (char) ((ch - 'a' + n) % 26 + 'a');
			//대문자일 경우
			} else if(Character.isUpperCase(ch)) { 
				ch = (char) ((ch - 'A' + n) % 26 + 'A'); 
			} 
			//answer에 답을 더한다.
			answer += ch; 
		} 
		return answer; 
	}				
}


