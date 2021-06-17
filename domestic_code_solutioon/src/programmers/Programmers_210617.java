package programmers;

public class Programmers_210617 {
	//출처 : https://programmers.co.kr/learn/courses/30/lessons/12916.
	//대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
	//예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
	//제한사항
	//문자열 s의 길이 : 50 이하의 자연수
	//문자열 s는 알파벳으로만 이루어져 있습니다.
	
	boolean solution(String s) {
		//글자를 배열에 넣기 위한 선언
		String[] arr = new String[s.length()];
		//p를 세기 위한 선언
		int countP = 0;
		//y를 세기 위한 선언
		int countY = 0;
		//답을 넣는 변수
		boolean answer = false;
		//글자를 잘라서 배열에 넣는다.
		for (int i = 0; i < s.length(); i++) {
			//형변환을 한다.
			arr[i] = "" + s.charAt(i);
		}
		//배열의 길이만큼 돌리면서 글자를 센다
		for (int i = 0; i < arr.length; i++) {
			//글자의 대소에 상관 없이 센다.
			if (arr[i].equalsIgnoreCase("p")) {
				countP++;
			} else if (arr[i].equalsIgnoreCase("y")) {
				countY++;
			}
		}
		//같으면 true 반환
		if (countP == countY) {
			answer = true;
		}
		//리턴한다.
		return answer;
	}

//	public static void main(String[] args) {
//		String s = "pPoooyY";
//		String[] arr = new String[s.length()];
//		int countP = 0;
//		int countY = 0;
//		boolean answer = false;
//		
//		for(int i=0; i<s.length();i++) {
//			arr[i] = ""+s.charAt(i);
//		}
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i].equalsIgnoreCase("p")) {
//				countP++;
//			}else if(arr[i].equalsIgnoreCase("y")) {
//				countY++;
//			}
//		}
//		
//		if(countP==countY) {
//			answer = true;
//		}
//		
//		System.out.println(answer);
//		
//	}

}
