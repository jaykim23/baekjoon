package programmers;

public class Programmers_210614 {
	// 출처 : https://programmers.co.kr/learn/courses/30/lessons/12950
	//	행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 
	//	같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 
	//	행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
	 public int[][] solution(int[][] arr1, int[][] arr2) {
		 //answer 배열의 크기를 설정한다. i는 주어진 배열 전체의 길이를하고, j는 주어진 배열의 값의 배열의 길이를 넣는다.
		int[][] answer = new int[arr1.length][arr1[0].length];
		//각 도메인 값의 위치를 설정한다.
		for(int i=0; i<arr1.length;i++) {
			for(int j=0; j<arr1[i].length;j++) {
				//해당 값들을 더한다.
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		//리턴한다.
        return answer;
    }    
//	public static void main(String[] args) {
//		int[][] arr1 = {{1,2},{2,3}}; 
//		int[][] arr2 = {{2,3},{3,4}};
//		int[][] answer = new int[arr1.length][arr1[0].length];
//		
//		for(int i=0; i<arr1.length;i++) {
//			for(int j=0; j<arr1[i].length;j++) {
//				answer[i][j] = arr1[i][j] + arr2[i][j];
//			}
//			
//		}
//		for(int i=0; i<arr1.length;i++) {
//			for(int j=0; j<arr1[i].length;j++) {
//				System.out.println(answer[i][j]+",");
//			}
//			
//		}
//		
//	}
}
