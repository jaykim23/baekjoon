package programmers;

import java.util.ArrayList;

public class Programmers_210604 {
//  출처 : https://programmers.co.kr/learn/courses/30/lessons/12906
//	배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 
//	이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
//	단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 
//	예를 들면,
//
//	arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
//	arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
//	배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
	 public int[] solution(int []arr) {
		 	//list라는 중복되지 않은 것을 모아두는 배열을 선언
			ArrayList<Integer> list = new ArrayList<Integer>();
			//조건에 0-9까지의 정수라고 했으니 현재 숫자가 뭐가 오든 0-9까지의 수만 아니면 된다.
			int current = 10;
			//arr이 길이만큼 돌린다.
			for(int i=0;i<arr.length;i++) {
				//같지 않으면 list에다가 넣고
				if(arr[i] != current) {
					list.add(arr[i]);
					//현재 숫자를 저장한다.
					current=arr[i];
				}
			}
			//answer 배열을 선언한다.
			int[] answer = new int[list.size()];
			//list의 크기만큼 돌린다.
			for(int i=0;i<list.size();i++) {
				//answer배열에 넣는다.
				answer[i] = list.get(i);
			}
			return answer;
		}
//	public static void main(String[] args) {
//		int[] arr = {1,1,3,3,0,1,1};
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		int current = 10;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] != current) {
//				list.add(arr[i]);
//				current=arr[i];
//			}
//		}
//		int[] answer = new int[list.size()];
//		for(int i=0;i<list.size();i++) {
//			answer[i] = list.get(i);
//		}
//		
//		
//		for(int i=0;i<answer.length;i++) {
//			System.out.println(answer[i]);
//		}
//		
//	}
}
