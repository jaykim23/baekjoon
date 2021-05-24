package programmers;

public class programmers_210524 {
	//출처 : https://programmers.co.kr/learn/courses/30/lessons/12903
	//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
	//단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다
		 public String solution(String s) {
		        String answer = "";
		        		//단어의 길이를 잰다.
				int count = s.length();
				//길이가 짝수인지 홀수인지 나머지를 통해 비교한다.
				if(count%2==0) {
					char answer_even1 = s.charAt((count/2)-1);
					char answer_even2 = s.charAt((count/2));
					//charAt()으로 출력한다.
					answer = ""+answer_even1 + answer_even2;
				}else {
					char answer_odd = s.charAt((count/2));
					//charAt()으로 출력한다.
					answer = ""+answer_odd;
				}
		        return answer;
		    }
    }

