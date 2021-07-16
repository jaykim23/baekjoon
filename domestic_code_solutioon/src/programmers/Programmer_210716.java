package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Programmer_210716 {
		//출처 : https://programmers.co.kr/learn/courses/30/lessons/12939
		//문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. 
		//str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
		//예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
		public String solution(String s) {
	        String answer = "";
	        //문자열s를 split으로 공백을 기준으로 잡고 나눈다.
	        String[] strings = s.split(" ");
	        //숫자를 배열에 넣는다.
	        int[] nums = new int[strings.length];
	        //나눈 strings를 int로 형변환 한다.
	        for(int i=0; i<strings.length; i++) {
	            nums[i] = Integer.parseInt(strings[i]);
	        }
	        //최소와 최대의 수를 선언한다.
	        int min = nums[0];
	        int max = nums[0];
	 
	        for(int i=0; i<nums.length; i++) {
	        	//min이 nums배열과 비교했을때 작으면 nums로 교환해준다.
	            if(min>nums[i]) {
	                min = nums[i];
	            }
	            //max가 nums배열과 비교했을때 크면 nums로 교환해준다.
	            if(max<nums[i]) {
	                max = nums[i];
	            }
	        }
	        //리턴한다.
	        answer = min +" "+ max;
	 
	        return answer;
	    }
}
