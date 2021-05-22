package programmers;

import java.util.Arrays;

class Solution {
    public String solution(String phone_number) {
//    	출처 : https://programmers.co.kr/learn/courses/30/lessons/12948
//		프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
//		전화번호가 문자열 phone_number로 주어졌을 때, 
//		전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, 
//		solution을 완성해주세요. 
    	
    	String answer = "";
        //자른 번호를 저장할 배열
    	String[] temp = new String[phone_number.length()];
    	
		for(int i=0;i<phone_number.length();i++) {
			//주어진 번호를 하나씩 자른다
			temp = phone_number.split("");
		}
		//주어진 번호 -4의 길이만큼 *로 바꾼다.
		for(int i=0;i<temp.length-4;i++) {
			temp[i] = "*";
		}
		//배열을 붙여서 answer에 넣는다.
		for(int i=0;i<temp.length;i++) {
			answer += temp[i];
		}
        return answer;
    }
}

