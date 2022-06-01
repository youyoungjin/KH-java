package 변수;

public class 예제 {
	public static void main(String[] args) {
		
		int a = 1;//2
		int b = 2;//3
		int c = 3;//1
		
		int as = a;//1
		int ad = c;//3
		
		 a = b;
		 c = as;
		 b = ad;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
}
