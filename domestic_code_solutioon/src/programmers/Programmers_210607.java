package programmers;

public class Programmers_210607 {
	// 출처 : https://programmers.co.kr/learn/courses/30/lessons/12943#
	//	1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.
	//
	//	1-1. 입력된 수가 짝수라면 2로 나눕니다. 
	//	1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
	//	2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
	//	예를 들어, 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다. 
	//	위 작업을 몇 번이나 반복해야하는지 반환하는 함수, solution을 완성해 주세요. 
	//	단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.
	int solution(int num) {
	    int answer = 0;
	    // 주어진 변수가 단위가 큰 홀수 일경우 변수 타입으로 인한 오버플로우가 발생할 수 있음 이를 방지하기 위한 형변환
	    long newNum = num;
	    // 반복을 체크하기 위한 변수
	    int count =0;
	    // newNum이 1이 아닐땐 계속 돌아간다.
	    while(newNum!=1){
	    	// 짝수일경우
	        if(newNum%2==0){
	        	// 2로 나눈다.
	            newNum /= 2;
	        // 홀수일 경우
	        }else{
	        	// 3을 곱하고 1을 더한다.
	            newNum = (newNum*3)+1;
	        }   
	        // 반복을 센다.
	        count++;
	        // 반복이 500이 되었을 때의 조건문
	        if(count == 500){ 
	        	// -1로 count에 넣는다.
	            count = -1;
	            break;
	        }
	    }
	    // 답에 count를 넣음으로써 500이 넘지 않으면 횟수가 들어가고 500이 넘으면 -1이 들어간다.
	    answer = count;
	    // 리턴한다.
	    return answer;
	}
}
