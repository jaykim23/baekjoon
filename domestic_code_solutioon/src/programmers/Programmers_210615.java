package programmers;

public class Programmers_210615 {
	  public String solution(String s) {
		  String answer = "";
		  //주어진 문자열 s를 한글자씩 나눈다.(공백포함)
		  String str[] = s.split("");
		  //공백에 대한 변수 설정
          String space = " ";
          //위치를 가늠하는 count 변수
          int count= 0;
          //str배열의 길이만큼 반복한다.
          for(int i = 0; i < str.length; i++){
              //배열이 공백일 경우에는 카운트를 하지 않고
        	  if(str[i].equals(space)){
            	  count = 0;
              }else{
            	 //카운트가 짝수일 경우
                 if(count % 2 == 0){
                	//하나를 증가시킨다. 다음에 카운트가 홀수가 될 수 있도록
                	count++;
                	//대문자로 치환한다.
                    str[i] = str[i].toUpperCase();
                 }else{
                	//다음에 카운트 짝수를 위해 하나 증가. 
                	count++;
                	//소문자로 바꾼다.
                    str[i] = str[i].toLowerCase();
                 }
              }
        	  //str을 모두 answer에 더한다.
              answer += str[i];
          }
          System.out.println(answer);
        return answer;
    }
}
