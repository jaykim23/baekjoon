package programmers;

import java.util.ArrayList;

public class Programmers_210627 {
	// 출처 : https://programmers.co.kr/learn/courses/30/lessons/12928
	// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
	 public int solution(int n) {
	 	//답 변수
        int answer = 0;
        //arraylist 선언
        ArrayList<Integer> list = new ArrayList<Integer>();
        //약수는 나눴을 때 나머지가 0인 것 여기서 i는 보통 0부터 시작하지만 나누기 떄문에 1부터 시작
        for(int i=1;i<=n;i++) {
			if(n%i==0) {
				//리스트에 넣는다.
				list.add(i);
			}
		}
		//list size 만큼 돌린다.
		for(int i=0;i<list.size();i++) {
			//답에 약수들을 더한다.
			answer += list.get(i);
		}
		//리턴한다.
        return answer;
    }	
//	public static void main(String[] args) {
//		int n = 12;
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		int answer = 0;
//		
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				list.add(i);
//			}
//		}
//		
//		for(int i=0;i<list.size();i++) {
//			answer += list.get(i);
//		}
//		
//		System.out.println(answer);
//	}
}
