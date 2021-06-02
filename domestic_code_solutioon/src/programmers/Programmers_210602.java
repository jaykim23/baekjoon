package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Programmers_210602 {
	// 출처 : https://programmers.co.kr/learn/courses/30/lessons/12917
	//	문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
	//	s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
	public String solution(String s) {
		//리턴할 변수 선언
        String answer = "";
        //s를 자르고 넣을 배열
        ArrayList<Character> list = new ArrayList<Character>();
        //charAt으로 한글자씩 자른다.
        for(int i=0; i<s.length();i++){
        	//list에 한글자씩 넣는다.
            list.add(s.charAt(i));
        }
        //역순정렬한다.
		Collections.reverse(list);
        for(int i=0;i<list.size();i++){
        	//answer 변수에 하나씩 더한다.
            answer += list.get(i);
        }
        //return한다.
        return answer;
    }
//	public static void main(String[] args) {
//		String answer = "";
//		String s = "Zbcdefg";
//        ArrayList<Character> list = new ArrayList<Character>();
//        for(int i=0; i<s.length();i++){
//            list.add(s.charAt(i));
//        }
//		Collections.reverse(list);
//        for(int i=0;i<list.size();i++){
//            answer += list.get(i);
//        }
//        
//        System.out.println(answer);
//		
//		
//	}
}
