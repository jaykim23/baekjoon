package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Programmers_210529 {
    //출처 : https://programmers.co.kr/learn/courses/30/lessons/12910
	//array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
	//divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
	
	public ArrayList<Integer> solution(int[] arr, int divisor) {
    	//주어지는 배열이 얼마나 될지 모르기 때문에 ArrayList로 배열 선언
		ArrayList<Integer> answer = new ArrayList<Integer>();
        //주어지는 입력 배열길이 만큼 반복문을 돌린다.
		for(int i=0;i<arr.length;i++) {
			//배열의 값과 나누는 값의 나머지를가 0이면 나누어 떨어지는것
			if(arr[i] % divisor == 0) {
				//그 배열의 값을 answer에 넣는다.
				answer.add(arr[i]);
			}
		}
		//반복문을 돌고 나와서 answer의 길이가 0이면 배열에 -1을 집어 넣는다.
		if(answer.size()==0) {
			answer.add(-1);
		}
		//배열을 오름차순으로 정렬한다.
		Collections.sort(answer);
		//값을 반환한다.
        return answer;
    }
}
