package programmers;

import java.util.Scanner;

public class Programmers_210618 {
	//	출처 : https://programmers.co.kr/learn/courses/30/lessons/12969
	//	이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
	//	별(*) 문자를 이용해 가로의 길이가 n, 
	//	세로의 길이가 m인 직사각형 형태를 출력해보세요.
	public static void main(String[] args) {
		//입력받기 위한 변수 선언
        Scanner sc = new Scanner(System.in);
        //a값 입력받기
        int a = sc.nextInt();
        //b값 입력받기
        int b = sc.nextInt();
        //출력될 줄 선언
        String line = "";
        //a만큼 *을 String에 넣는다.
        for(int i=0;i<a;i++){
        	//*을 a번만큼 넣는다.
          line += "*";  
        }
        //b만큼 반복해서 출력한다.
        for(int i=0;i<b;i++){
            System.out.println(line);
        }

    }
	
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		String s = "";
//		
//		for(int i=0;i<a;i++) {
//			s += "*";
//		}
//		for(int j=0;j<b;j++) {
//			System.out.println(s);
//		}
//		
//	}
}
