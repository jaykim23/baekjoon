package programmers;

import java.util.ArrayList;

public class Programmers_210610 {
	    public int solution(int[][] board, int[] moves) {
	    	//뽑은 것을 저장하는 배열 선언
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        //답 변수 선언
	        int answer = 0;
	        //중복되는 숫자 카운트하는 변수.
	        int erase_count = 0;
	        //moves의 배열 반복
	        for(int i=0; i<moves.length;i++) {
	        	//주어진 moves를 x, 보드의 y축을 j 로하고 반복문으로 해당 위치의 값을 비교하기 위한 반복
				for(int j=0;j<board.length;j++) {
					//해당 위치의 값이 0이 아닐 경우
					if(board[j][moves[i]-1] != 0) {
						//이전값과 비교하기 위해서 선제적으로 현재list의 값이 있는지 여부를 판단
						//비었을 경우
						if(list.isEmpty()) {
							//값을 바로 넣는다.
							list.add(board[j][moves[i]-1]);
						//안비었을 경우
						}else {
							//리스트의 마지막값과 넣을 값을 비교한다.리스트값이 다를경우 리스트에 넣는다.
							if(board[j][moves[i]-1] != list.get(list.size()-1)) {
								list.add(board[j][moves[i]-1]);
							//같을 경우 리스트 마지막 값을 지운다.	
							}else {
								list.remove(list.size()-1);
								//지워진 숫자의 갯수를 카운트한다.
								erase_count++;
							}
						}
						//보드에서 리스트에 넣은뒤 해당 위치값에 0을 넣어 없다는 것을 표시한다.
						board[j][moves[i]-1] = 0;
						//리스트에 넣고 해당 위치의 값도 0으로 바꿨으니 반복을 멈춘다.
						break;
					}
				}
			}
	        //답에 지워진 숫자의 *2를 하므로써 없어진 리스트내의 블록의 갯수를 저장한다.
			answer = erase_count*2;
			//답을 리턴한다.
	        return answer;
	    }
//	public static void main(String[] args) {
//		int answer = 0; 
//		int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
//		int[] moves = {1,5,3,5,1,2,1,4};
//		int erase_count = 0;
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		
//		//moves에 있는 행동들이 모두 실행이 되어야 함
//		//행동들이 실행이되고 실행이 된 부분을 0으로 바꿔줘야함
//		//실행이 된부분을 뽑아 놓은 것들에 대한 배열에 넣어줘야함
//		//연속된것이 중복된게 있으면 지워진다.
//		
//		for(int i=0; i<moves.length;i++) {
//			for(int j=0;j<board.length;j++) {
//				if(board[j][moves[i]-1] != 0) {
//					if(list.isEmpty()) {
//						list.add(board[j][moves[i]-1]);
//					}else {
//						if(board[j][moves[i]-1] != list.get(list.size()-1)) {
//							list.add(board[j][moves[i]-1]);
//						}else {
//							list.remove(list.size()-1);
//							erase_count++;
//						}
//					}
//					board[j][moves[i]-1] = 0;
//					break;
//				}
//			}
//		}
//		answer = erase_count*2;
//		System.out.println("출력된 배열 : "+ list);
//		System.out.println("지워진 숫자 종류 : " + erase_count);
//		System.out.println("전송할 값 : " + answer);
		
		
		
		
		
		
//		//문제 일부분 개념 이해용 연습 : moves 중 1개만 가지고 그 위치에 있는 번호를 뽑아내고 0으로 바꿔보기
//		//현재 moves[0]으로 고정
//		//n*n이기 때문에 length도 상관 없음.
//		//board.length만큼 반복문으로 0이 아닌 수 판별하고 정답 배열에 넣은뒤 2차원 배열값 0으로 바꾸고 출력까지하기
//		
//		//i는 행의 n값
//		// y값이 고정된채로 x축 탐색 끝까지 탐색
//		for(int i=0;i<board.length;i++) {
//			//board[i][moves[0]-1]의 값이 0이 아닐때 //moves[0]에서 1을 빼는 이유는 배열은 0부터 시작하기 때문.
//			if(board[i][moves[0]-1] != 0) {
//				//존재하는 값을 리스트에 삽입.
//				test.add(board[i][moves[0]-1]);
//				//리스트에 넣어진 값은 0으로 재설정.
//				board[i][moves[0]-1] = 0;
//			}
//		}
//		//리스트를 출력.
//		System.out.println("테스트 리스트 : "+test);
//		//실제 n*n의 값이 제대로 바뀌었는지 체크.
//		System.out.println("3,4번째 리스트의 값 : "+board[3][moves[0]-1]+","+board[4][moves[0]-1]);
		
		
		
		
		
		
		
//	}
}
