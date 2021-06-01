package programmers;

public class Programmers_210601 {
//	출처 : https://programmers.co.kr/learn/courses/30/lessons/12912
//	두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
//	예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.\
	
//	제한 조건
//	a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
//	a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
//	a와 b의 대소관계는 정해져있지 않습니다.
	
	
	public long solution(int a, int b) {
		//합의 변수 타입
        long answer = 0;
		
        //반복문 i의 시작점을 Math.min()으로 작은 걸 비교해서 시작. 종료는 Math.max()로 끝낸다.
		for(int i=Math.min(a, b);i<=Math.max(a, b);i++) {
			//사이에 있는 정수값을 모두 더한다.
			answer += i;
		}
		
        //answer를 반환한다.
        return answer;
    }
//	public static void main(String[] args) {
//		int a = 1;
//		int b = 5;
//		long answer = 0;
//		
//		for(int i=Math.min(a, b);i<=Math.max(a, b);i++) {
//			total += i;
//		}
//		
//		
//		System.out.println(answer);
//	}
}
