package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Programmers_210605 {
	//출처 : https://programmers.co.kr/learn/courses/30/lessons/12915
	//	문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
	//	예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
	//	strings는 길이 1 이상, 50이하인 배열입니다.
	//	strings의 원소는 소문자 알파벳으로 이루어져 있습니다.
	//	strings의 원소는 길이 1 이상, 100이하인 문자열입니다.
	//	모든 strings의 원소의 길이는 n보다 큽니다.
	//	인덱스 1의 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치합니다.
	public String[] solution(String[] strings, int n) {
        ArrayList<String> list = new ArrayList<String>();
        //정답의 배열 선언 길이는 arr의 길이와 같다.
		String[] answer = new String[strings.length];
        //list에 strings[i].charAt(n)+strings[i]를 넣는다.
		for(int i=0;i<strings.length;i++) {
			list.add(strings[i].charAt(n)+strings[i]);
		}
        //list에 있는 값들을 알파벳 순으로 정렬한다.
		Collections.sort(list);
        //다시 list의 값들의 1번째 글자부터 잘라서 answer배열에 넣는다.
		for(int i=0; i<list.size();i++) {
			answer[i] = list.get(i).substring(1);
		}
        //return한다.
        return answer;
    }
//	public static void main(String[] args) {
//		//주어진 배열
//		String[] arr = {"sun","bed","car"};
//		//arr의 도메인의 n번째 글자와 기존 arr의 도메인 값을 더해서 넣기 위한 배열
//		ArrayList<String> list = new ArrayList<String>();
//		//n번째 글자 선언
//		int n=1;
//		//정답의 배열 선언 길이는 arr의 길이와 같다.
//		String[] answer = new String[arr.length];
//		//list에 arr[i].charAt(n)+arr[i]를 넣는다.
//		for(int i=0;i<arr.length;i++) {
//			list.add(arr[i].charAt(n)+arr[i]);
//		}
//		//list에 있는 값들을 알파벳 순으로 정렬한다.
//		Collections.sort(list);
//		//다시 list의 값들의 1번째 글자부터 잘라서 answer배열에 넣는다.
//		for(int i=0; i<list.size();i++) {
//			answer[i] = list.get(i).substring(1);
//		}
//		
//		//배열의 원소별로 값을 비교한다.
//		for(int i=0; i<arr.length;i++) {
//			System.out.println(answer[i]+"");
//		}
//		
//	}
}
