package programmers;

import java.util.Arrays;

public class programmers_210511 {
	
	 public int[] solution(int[] array, int[][] commands) {
		 
		 	//조금 더 고민해야함
	        
		    //         배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.=
		    // 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
		    // array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
		    // 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
		    // 2에서 나온 배열의 3번째 숫자는 5입니다.
		    // 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 
		    //연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
		        
		        
		        //답에 대한 배열을 주어진 commands의 길이에 맞게 설정한다.
		        int[] answer = new int[commands.length];
		        
		        //commands의 길이 만큼 돌린다 -> 주어진 횟수만큼 돌린다.
		        for(int i=0;i<commands.length;i++){
		            //배열을 일정 부분까지만 복사하는 명령어
		            int[] temp = new int[commands[i][1]-(commands[i][0]-1)];
		            
		            for(int j=0; j<temp.length;j++){
		                temp[j] = array[j+(commands[i][0]-1)];
		            }
		            //배열을 정렬한다.
		            Arrays.sort(temp);
		            answer[i] = temp[commands[i][2]-1];
		        }
		        
		        return answer;
		    }
	
}
