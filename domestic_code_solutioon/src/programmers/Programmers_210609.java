package programmers;

public class Programmers_210609 {
	// 출처 : https://programmers.co.kr/learn/courses/30/lessons/12940
	// 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
	//	배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
	//	예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
	//
	//	제한 사항
	//	두 수는 1이상 1000000이하의 자연수입니다.
	//유클리드 호제법을 쓴다.
	 public int[] solution(int n, int m) {
		 	//answer 배열 선언
	        int[] answer = new int[2];
	        //0번째 배열에는 최대공약수
	        answer[0] = gcf(n,m);
	        //1번째 배열에는 최소공배수
			answer[1] = lcm(n,m);
			//리턴한다.
	        return answer;
	    }
	 	//최대공약수 구하는 메소드
	    public static int gcf(int n, int m) {
			//유클리드 호제법에 따라 나누는 작은 수가  0보다 커야한다. 0이 나올 때까지 무한반복
			while(Math.min(n, m)>0) {
				//temp에 n을 넣고
				int temp = n;
				//m을 n에 넣고
				n = m;
				// n을 m으로 나눈 나머지를 m에 넣는다.
				m = temp % m;
			}
			return n;
		}
	    //최소공배수
		public static int lcm(int n, int m) {
			//n*m을하고 최대 공약수로 나누어 준다.
			return n * m / gcf(n,m);
		}
//	public static void main(String[] args) {
//		//유클리드 호제법을 사용한다.
//		int[] answer = new int[2];
//		//주어지는 수
//		int n = 2;
//		int m = 5;
//		//배열에 넣는다.
//		answer[0] = gcf(n,m);
//		answer[1] = lcm(n,m);
//		
//		
//	}
//	public static int gcf(int n, int m) {
//		
//		while(Math.min(n, m)>0) {
//			int temp = n;
//			n = m;
//			m = temp % m;
//		}
//		return n;
//	}
//	public static int lcm(int n, int m) {
//		
//		return n * m / gcf(n,m);
//	}
}
