package programmers;

public class programmers_210521 {
	
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        
	    	String answer = ""; 
	    	//participant의 배열의 길이만큼 반복문으로 돌린다
	    	for(String part : participant) { 
	    		//통과를 했는지 안했는지 검토
	            boolean bool = true;
	            //완주한 사람들의 배열만큼 반복문 돌린다
	            for(int i=0;i<completion.length; i++) {
	            	//잘라낸 만큼 완주자와 같은지 확인한다.
	                if(part.equals(completion[i])) {
	                    //true이면 완주를 못한것 false이면 완주한것
	                	bool = false;
	                	//완주한 사람들은 빈값으로 넣는다. 그렇게 되면 completion에는 완주하지 못한 사람들만 남는다.
	                    completion[i]=""; 
	                    break; 
	                } 
	            } 
	            if(bool) {
	                answer = part; 
	            } 
	        } 
	        return answer;
	    }
	}

}
