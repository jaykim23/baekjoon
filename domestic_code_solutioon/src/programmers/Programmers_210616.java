package programmers;

public class Programmers_210616 {
	//	출처 : https://programmers.co.kr/learn/courses/30/lessons/12921
	//	1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
	//
	//	소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
	//	(1은 소수가 아닙니다.)
    public int solution(int n) {
    	
    	//정답의 갯수
        int answer = 0;
		//n까지의 번호를 하나씩 배열에 넣기 위한 배열 선언
		int[] num = new int[n+1];
		//번호를 하나씩 배열에 넣는다. 1은소수가 될 수 없기때문에 2부터 시작
		for(int i=2; i<=n;i++) {
			num[i] = i;
		}
		//에라토스테네스의 체를 적용
		for(int i=2;i<=n;i++) {
			// 배열 속 번호가 0이면 넘어간다.
			if(num[i] == 0) {
				continue;
			}
			//에라토스테네스의 체 : 소수를 찾으면 그 배수를 0으로 바꾼다.
			for(int j = 2*i ; j<=n;j+=i) {
				num[j] = 0;
			}
		}
		//0이 아닌 것이 나올경우 answer를 증가시킨다.
		for(int i=0; i<num.length;i++) {
			if(num[i] != 0) {
				answer++;
			}
		}
		//리턴한다.
        return answer;
    }
//	public static void main(String[] args) {
//		int n = 10;
//		int answer = 0;
//		
//		int[] num = new int[n+1];
//		
//		for(int i=2; i<=n;i++) {
//			num[i] = i;
//		}
//		
//		for(int i=2;i<=n;i++) {
//			if(num[i] == 0) {
//				continue;
//			}
//			for(int j = 2*i ; j<=n;j+=i) {
//				num[j] = 0;
//			}
//		}
//		
//		for(int i=0; i<num.length;i++) {
//			if(num[i] != 0) {
//				answer++;
//			}
//		}
//		
//		System.out.println("return : " + answer);
//	}
	
}
