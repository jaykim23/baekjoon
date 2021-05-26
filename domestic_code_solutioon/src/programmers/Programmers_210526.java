package programmers;




public class Programmers_210526 {
	public static void main(String[] args) {
		//출처 : https://programmers.co.kr/learn/courses/30/lessons/12932?language=java
		//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
		//예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
        //ex
		long n = 12345;
		String nString = Long.toString(n);
		String[] array = nString.split("");
		int[] answer = new int[array.length];
		
		
		for(int i=0;i<array.length;i++) {
				answer[i] = Integer.parseInt(array[answer.length-1-i]);
			}
		
		for(int i=0;i<array.length;i++) {
			System.out.print(answer[i]+"");
			}	
	}//main
}//class
