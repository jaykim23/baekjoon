package programmers;

public class Programmers_210704 {
	//출처 : https://programmers.co.kr/learn/courses/30/lessons/12901
	//	2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 
	//	두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 
	//	요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT입니다.  
	//	예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
	 public String solution(int a, int b) {
         String answer = "";
         // 요일 변수 배열
         String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
         // 윤년 일수 배열
         String[] year = new String[366];
         // 월에 있는 날짜에 대한 배열
         int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
         // a월 b일의 날짜
         int want_day = 0;
         
         // 1월 1일이 금요일이기에 (i+5)를 하여 금요일을 시작으로 만들었다.
         for(int i=0; i<year.length; i++) {
        	 //year배열에 요일을 집어 넣는다.
             year[i] =  day[(i+5)%7];
         }
         
         for(int i=0; i<a-1; i++) {
             //want_day에 달만큼 날짜를 넣는다.
        	 want_day += month[i]; 
         }
         //1월 1일도 하루 지난 것으로 되어서 -1을 해야한다
         want_day += b-1;
         //answer에 요일을 집어 넣는다.
         answer = year[want_day];
         //리턴한다.
         return answer;
     }
}
