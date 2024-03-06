package exam;

public class Continue {
//1부터 100까지의 홀수의 합 구하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int num;
		
		 for(num = 1; num <=100; num++) {
			 if(num % 2 == 0)
				 continue; //num이 짝수일 경우는 생략하고 num++하던 것을 반복해서 수행해라.
			 total += num;
		 }
		 System.out.println("1부터 100까지의 홀수의 합은 " + total + "입니다.");
		
	}

}
