package programmers;

import java.util.ArrayList;
import java.util.TreeSet;



public class programmers_210525 {

//  출처 : https://programmers.co.kr/learn/courses/30/lessons/68644?language=java
//	정수 배열 numbers가 주어집니다. 
//	numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 
//	만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
	
	class Solution {
		//반환값을 arrayList로 바꾼다.
	    public ArrayList<Integer> solution(int[] numbers) {
	    	//중복저장을 하지 않는 treeset으로 배열에 있는 중복을 제거함과 동시에 오름차순으로 정렬한다.
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        //주어진 배열에서 0번째 숫자부터 끝번째 숫자까지 더하고 1번째부터 끝번째...까지 더한다.{1,2}{1,3},{1,4}...
	        for(int i=0;i<numbers.length-1;i++) {
	        	//더할 첫번째 수를 number1으로 지정한다. 
	        	int number1 = numbers[i];
	        	//i번째 배열값을 두번 더는 것은 불가능하기 때문에 여기서 j를 i+1로 지정한다.
	        	for(int j=i+1;j<numbers.length;j++) {
	        		//더할 두번째 수를 number2에 넣는다.
	        		int number2 = numbers[j];
	        		//두수를 더하고 total로 지정한다.
	        		int total = number1 +  number2;
	        		//중복저장을 하지 않는 treeset으로 배열에 있는 중복을 제거함과 동시에 오름차순으로 정렬한다.
	        		list.add(total);
	        	}//for j
	        }//for i
	        //treeset으로 중복을 제거하고 오름차순정렬한다.
	        TreeSet<Integer> set = new TreeSet<Integer>(list);
	        //set을 arraylist로 바꾼다.
	        ArrayList<Integer> answer = new ArrayList<Integer>(set);
	        return answer;
	    }//solution
	}
}
