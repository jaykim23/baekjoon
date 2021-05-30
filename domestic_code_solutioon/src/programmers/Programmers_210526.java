package programmers;




public class Programmers_210526 {
	public static void main(String[] args) {
		//출처 : https://programmers.co.kr/learn/courses/30/lessons/12932?language=java
		//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
		//예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
        //ex
		
		long n = 12345;
		//주어진 long타입의 숫자n을 형변환한다.
		String nString = Long.toString(n);
		//nString이라는 문자열을 array에 split함수를 써서 잘라 넣는다.
		String[] array = nString.split("");
		//answer배열을 선언한다. 길이는 array배열의 길이로 설정한다.
		int[] answer = new int[array.length];
		// array에 있는 문자열 배열들을 int로 형변환한다.
		for(int i=0;i<array.length;i++) {
				answer[i] = Integer.parseInt(array[answer.length-1-i]);
			}
		//answer의 길이만큼 반복분으로 출력한다.
		for(int i=0;i<array.length;i++) {
			System.out.print(answer[i]+"");
			}	
	}//main
}//class
