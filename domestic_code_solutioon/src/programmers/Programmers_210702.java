package programmers;

public class Programmers_210702 {
	//	출처 : https://programmers.co.kr/learn/courses/30/lessons/12919
	//	String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, 
	//	"김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. 
	//	seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
	public String solution(String[] seoul) {
        String answer = "";
        //김서방 찾는 변수
        String name = "Kim";
        //seoul이라는 배열을 탐색한다.
        for(int i=0; i<seoul.length; i++) {
			//같은 경우 그 숫자를 answer에 넣는다.
        	if(seoul[i].equals(name)) {
				answer = "김서방은 "+i+"에 있다";
			}
		}
        //리턴한다.
        return answer;
    }
//	public static void main(String[] args) {
//		String name = "Kim";
//		String[] seoul = {"Jane","Kim"};
//		String answer = "";
//		
//		for(int i=0; i<seoul.length; i++) {
//			if(seoul[i].equals(name)) {
//				answer = "김서방은"+ i +"에 있다.";
//			}
//		}
//	System.out.println(answer);
//	}
}
