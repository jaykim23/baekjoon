package programmers;
import java.util.*;

public class Programmers_210523 {
	//출처 : https://programmers.co.kr/learn/courses/30/lessons/12906
//	배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
//
//	arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
//	arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
//	배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
//
//	제한사항
//	배열 arr의 크기 : 1,000,000 이하의 자연수
//	배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
	
    public int[] solution(int []arr) {
        
    	//주어진 배열에서 중복된 번호를 모두 지운 것만 모아 놓는 배열
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	
    	//뒤에 나오는 번호를 비교한다.
    	for(int i=0; i<arr.length-1;i++) {
    		if(arr[i] != arr[i+1]) {
    			list.add(arr[i]);
    		}
    	}
    	//list에 넣는다.
    	list.add(arr[arr.length-1]);
    	
    	//답의 크기를 번호 종류 만큼 만든다.
    	int[] answer = new int[list.size()];
    	for(int i=0;i<answer.length;i++) {
    		answer[i] = list.get(i);
    	}
        return answer;
    }
}
