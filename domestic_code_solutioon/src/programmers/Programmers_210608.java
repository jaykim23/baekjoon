package programmers;

import java.util.ArrayList;

public class Programmers_210608 {
	// 출처 : https://programmers.co.kr/learn/courses/30/lessons/12954
	//	함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
	//	다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
	
	//문제에서 정술라고 했으니 x의 변수 타입을 long으로 바꾼다.
    public ArrayList<Long> solution(long x, int n) {
    	//리턴할 정답의 list를 선언한다.
        ArrayList<Long> list = new ArrayList<Long>();
        //n개의 숫자를 지닌다고 했으니 n번만큼 반복시킨다.
        for(int i=0;i<n;i++){
        	//temp값을 넣어서 list에 넣는다.
            long temp = x+(x*i);
            list.add(temp);
        }
        //list를 리턴한다.
        return list;
    }
    
//	public static void main(String[] args) {
//		int x = 2;
//		int n = 5;
//		ArrayList<Long> list = new ArrayList<Long>(); 
//		
//		for(int i=0; i<n;i++) {
//			long temp = x+(x*i);
//			list.add(temp);
//		}
//			System.out.println(list);
//	}
}
