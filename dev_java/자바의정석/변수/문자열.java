package 변수;

public class 문자열 {

	/* String의 경우 하나의 문자열을 String으로 변환 한 다음 
	 * + 덧셈연산을 하면 나머지 한쪽도 String으로 변환시킨다음 문자열이 된다.  
	 * 또한 7 + "" 와 같이 할때는 7이 출력된다.
	 */
	
	
	/* 값 바꾸기
	 * int = x; 
	 * int = y;
	 * 위 두 값을 바꿀려면 또하나의 빈컵 즉 빈 변수가 필요하다. 
	 * int trp;
	 * trp = z
	 * x = y
	 * y = trp
	 * 이렇게 하면 된다.
	 */
	
	public static void main(String[] args) {
		int f = 10, y = 2;
		int tgy = f;
		f = y;
		y = tgy;
		System.out.println("f=" + f);
		// ㅋㅋㅋ ㅆㅂ "f=" 이걸 적어 놓은 이유가 그냥 f=2 이렇게 출력할려는 거였군 ㅋㅋㅋ
		

	}

}
