package exam;

public class Break2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 0;
		
		for(num = 0; ; num++) {//조건식을 생략하고 break문 사용.
			sum += num;
			if(sum >= 100)//sum이 100보다 크거나 같을 때 종료.
				break;//반복문 바로 중단시킴.
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		
		/*
		 Break1.class에서 다룬 코드는 sum이 100을 넘게 되었고, num값이 1씩 증가하여 15가 된 것.
		 그 부분을 Break2.class에서 수정하여 100이 넘는 그 순간의 정확한 값을 알아보고자
		 sum이 100을 넘기는 순간에 반복문을 중단시킴.
		*/
	}

}
