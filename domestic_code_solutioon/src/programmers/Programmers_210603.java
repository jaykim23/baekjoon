package programmers;

public class Programmers_210603 {
	// 출처 : https://programmers.co.kr/learn/courses/30/lessons/12944
	//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
	//arr은 길이 1 이상, 100 이하인 배열입니다.
	//arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
	public double solution(int[] arr) {
		//합의 값을 선언한다
        double total = 0;
        //주어진 배열만큼 돌린다.
        for(int i =0;i<arr.length;i++) {
            total += arr[i];
		}
        //나눈 값을 answer에 넣는다.
        double answer = total/arr.length;
        //리턴한다.
        return answer;
    }
//	public static void main(String[] args) {
//		int[] arr = {1,2,3,4};
//		double total = 0;
//		
//		
//		
//		for(int i =0;i<arr.length;i++) {
//			total += arr[i];
//		}
//		
//		double answer = total/arr.length;
//		
//		System.out.println(answer);
//	}
}
