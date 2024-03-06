package exam;
//구구단 만들기
public class 중첩반복문 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
		int times;
		
		for(dan = 2; dan <= 19; dan++) {
			for(times = 1; times <= 19; times++) {
				System.out.println(dan + " X " + times + " = " + dan * times);
			}
			System.out.println();
		}
	}

}
