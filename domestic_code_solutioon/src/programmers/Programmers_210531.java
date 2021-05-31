package programmers;

public class Programmers_210531 {

	// 출처 : https://programmers.co.kr/learn/courses/30/lessons/77484
	// 로또를 구매한 민우는 당첨 번호 발표일을 학수고대하고 있었습니다.
	// 하지만, 민우의 동생이 로또에 낙서를 하여, 일부 번호를 알아볼 수 없게 되었습니다.
	// 당첨 번호 발표 후, 민우는 자신이 구매했던 로또로 당첨이 가능했던 최고 순위와 최저 순위를 알아보고 싶어 졌습니다.
	// 알아볼 수 없는 번호를 0으로 표기하기로 하고, 민우가 구매한 로또 번호 6개가 44, 1, 0, 0, 31 25라고 가정해보겠습니다.
	// 당첨 번호 6개가 31, 10, 45, 1, 6, 19라면, 당첨 가능한 최고 순위와 최저 순위의 한 예는 아래와 같습니다.
	// 순서와 상관없이, 구매한 로또에 당첨 번호와 일치하는 번호가 있으면 맞힌 걸로 인정됩니다.
	// 알아볼 수 없는 두 개의 번호를 각각 10, 6이라고 가정하면 3등에 당첨될 수 있습니다.
	// 3등을 만드는 다른 방법들도 존재합니다. 하지만, 2등 이상으로 만드는 것은 불가능합니다.
	// 알아볼 수 없는 두 개의 번호를 각각 11, 7이라고 가정하면 5등에 당첨될 수 있습니다.
	// 5등을 만드는 다른 방법들도 존재합니다. 하지만, 6등(낙첨)으로 만드는 것은 불가능합니다.
	// 민우가 구매한 로또 번호를 담은 배열 lottos, 당첨 번호를 담은 배열 win_nums가 매개변수로 주어집니다. 이때, 당첨 가능한
	// 최고 순위와 최저 순위를 차례대로 배열에 담아서 return 하도록 solution 함수를 완성해주세요.
	public int[] solution(int[] lottos, int[] win_nums) {
		// 일치하는 수의 갯수
		int count = 0;
		// 지워진 숫자의 갯수
		int erase_num = 0;

		// 이중for문을 돌려서 일치하는 번호를 찾는다.
		for (int i = 0; i < lottos.length; i++) {
			// 숫자가 지워진 갯수를 찾는다.
			if (lottos[i] == 0) {
				// 지워진 숫자의 갯수를 체크한다.
				erase_num++;
			}
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					// 일치하는 숫자가 있으면 증가 시킨다.
					count++;
				}
			}
		}

		// 최고로 맞을 경우 맞은 갯수
		int max_correct = count + erase_num;
		// 최고 등수
		int max_win = 0;

		// 최고로 맞을 때의 경우를 나눈다
		switch (max_correct) {
		case 0:
			max_win = 6;
			break;
		case 1:
			max_win = 6;
			break;
		case 2:
			max_win = 5;
			break;
		case 3:
			max_win = 4;
			break;
		case 4:
			max_win = 3;
			break;
		case 5:
			max_win = 2;
			break;
		case 6:
			max_win = 1;
			break;
		}

		// 최저로 맞을 경우 맞은 갯수
		int min_correct = count;
		// 최저 등수
		int min_win = 0;
		// 최저로 맞을 경우를 나눈다
		switch (min_correct) {
		case 0:
			min_win = 6;
			break;
		case 1:
			min_win = 6;
			break;
		case 2:
			min_win = 5;
			break;
		case 3:
			min_win = 4;
			break;
		case 4:
			min_win = 3;
			break;
		case 5:
			min_win = 2;
			break;
		case 6:
			min_win = 1;
			break;
		}
		// 순위 배열에 넣는다.
		int[] answer = { max_win, min_win };
		return answer;
	}
	
	//이클립스 실행용
	public static void main(String[] args) {
		int[] lottos = { 44, 1, 0, 0, 31, 25 };
		int[] win_nums = { 31, 10, 45, 1, 6, 19 };

		// 일치하는 수의 갯수
		int count = 0;
		// 지워진 숫자의 갯수
		int erase_num = 0;

		// 이중for문을 돌려서 일치하는 번호를 찾는다.
		for (int i = 0; i < lottos.length; i++) {
			// 숫자가 지워진 갯수를 찾는다.
			if (lottos[i] == 0) {
				// 지워진 숫자의 갯수를 체크한다.
				erase_num++;
			}
			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					// 일치하는 숫자가 있으면 증가 시킨다.
					count++;
				}
			}
		}

		// 최고로 맞을 경우 맞은 갯수
		int max_correct = count + erase_num;
		// 최고 등수
		int max_win = 0;

		// 최고로 맞을 때의 경우를 나눈다
		switch (max_correct) {
		case 0:
			max_win = 6;
			break;
		case 1:
			max_win = 6;
			break;
		case 2:
			max_win = 5;
			break;
		case 3:
			max_win = 4;
			break;
		case 4:
			max_win = 3;
			break;
		case 5:
			max_win = 2;
			break;
		case 6:
			max_win = 1;
			break;
		}

		// 최저로 맞을 경우 맞은 갯수
		int min_correct = count;
		// 최저 등수
		int min_win = 0;
		// 최저로 맞을 경우를 나눈다
		switch (min_correct) {
		case 0:
			min_win = 6;
			break;
		case 1:
			min_win = 6;
			break;
		case 2:
			min_win = 5;
			break;
		case 3:
			min_win = 4;
			break;
		case 4:
			min_win = 3;
			break;
		case 5:
			min_win = 2;
			break;
		case 6:
			min_win = 1;
			break;
		}
		// 순위 배열에 넣는다.
		int[] answer = { max_win, min_win };
		// 배열을 출력한다.
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

	}

}
