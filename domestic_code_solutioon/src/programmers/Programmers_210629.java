package programmers;

import java.util.ArrayList;

public class Programmers_210629 {
	// 출처 : https://programmers.co.kr/learn/courses/30/lessons/12947
	//	양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
	//	예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
	//	자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

    public boolean solution(int x) {
        boolean answer = false;
        //입력받은 숫자를 String으로 치환
        String sx = x+"";
        //자릿수 더할 변수
		int check = 0;
		//배열 선언
        ArrayList<Character> list = new ArrayList<Character>();
		//각 자리수를 배열에 넣는다.
		for(int i=0;i<sx.length();i++) {
			list.add(sx.charAt(i));
		}
		//배열의 값을 int로 바꾼다.
		for(int i=0;i<list.size();i++) {
			check += Character.getNumericValue(list.get(i));
		}
		//나눴을 때 나머지가 0인지 확인한다.
		if(x%check == 0) {
			//값을 바꾼다.
			answer = !answer; 
		}
		//리턴한다.
        return answer;
    }
//	public static void main(String[] args) {
//		int x = 11;
//		String sx = x+"";
//		int check = 0;
//		boolean answer = false;
//		ArrayList<Character> list = new ArrayList<Character>();
//		
//		for(int i=0;i<sx.length();i++) {
//			list.add(sx.charAt(i));
//		}
//		
//		for(int i=0;i<list.size();i++) {
//			check += Character.getNumericValue(list.get(i));
//			
//		}
//		
//		if(x%check == 0) {
//			answer = !answer; 
//		}
//		
//		
//		System.out.println("답 : "+answer);
//	}
	
}
