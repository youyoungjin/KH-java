package 프로그램;

import java.util.Scanner;

import java.util.Random;

public class 구구단게임 {
		   
		public static void main(String[] args) {
		// L String 문자열을 뜻하고 자료형이다.
		@SuppressWarnings("resource")
		// L 이건 문제 있는 변수를 서버? 에 넣어놓을 수 있다!, 나중에 꺼내서 해결 할 수 있다??
		Scanner sc = new Scanner(System.in);
		Random ra = new Random();
		// L 랜덤 과 스캐너 인스턴스 화 시킨다.
		// 반복문은 어떤 작업(코드들)이 반복적으로 실행되도록 할 때 사용되며
		// 반복문의 종류로는 for문, while문, do-while문이 있습니다.
		// for문 반복횟수가 정해져 있는 경우에 사용한다.
		// while문 반복횟수가 정해져있지 않는 경우에 사용한다.
		// do-while문 제어 변수가 없고 반복횟수가 정해져 있지 않을 때 사용한다.
				
		 while(true) {
		 // 조건문으로 true 일 경우 계속 조건문을 진행 시키는 조건문이라  while을 사용함. 	
		int count = 0;
		//   L count 해당 범위 내 까지 세는 것을 의미한다.
		System.out.println("ㅠㅠ하아~ 구구단 소스.(총 3문제이다)");
		for (int a=1; a<9; a++) {
		 // for 문은 반복횟수가 정해져 있는 조건문일때 사용한다.
		int r = ra.nextInt(9)+1;
//		          L nextInt는 해당 범위 내에 있는 숫자를 입력 시킬때 사용한다.
		int r2 = ra.nextInt(9)+1;
		System.out.printf(a+"번. "+r+"X"+r2+"= ");
		// printf = %d, %s 등을 쓰기위해 사용한다. ex) 정수, 실수 등등 이 필요할때 사용
		// print = 괄호안 내용을 단순히 출력한다.
		// println = 괄호안 문자를 출력후 밑으로 한칸 띄어짐
		int input = sc.nextInt();
		         
		if(input==(r*r2)) {
		System.out.println("정답");
		count++;
		// 조건문으로 같으면 자신이 설정한 결과가 나오는 것
		}
		else if(input!=(r*r2)) {
		System.out.println("틀렸습니당~"+(r*r2)+"이에여~~.");
		// else if 문과 반대로 같지 않으면 결과가 나오는 것!!
								}
							}
		System.out.println("====================");
		if (count==3) {
		System.out.println("잘가~~~.*^^*");
		System.out.println("====================");
							}
		else if (count==0) {
		System.out.println("빵점");
		System.out.println("====================");
		 }
		else {System.out.println("8문제중 "+count+"문제 맞췄다.");
		System.out.println("====================");
							}
		System.out.println("한판더~? (1)예 (2)아니오");
		int input2 = sc.nextInt();
		// nextInt() 메서드는 int형 정수를 입력받는 메서드입니다.
		if(input2==2) {
		System.out.println("잘가~~.");
		break;
							}
						}
		}//main
		
	}//class


