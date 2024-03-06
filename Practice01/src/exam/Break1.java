package exam;
//0부터 1씩 증가시키며 합을 구할 때에 합이 100이 넘는 최솟값 구하기
public class Break1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 0;
		
		for(num = 0; sum < 100; num ++){//sum이 100보다 크면 종료.
			sum += num;
		}
		
		System.out.println( "num : " + num);
		System.out.println("sum : " + sum);
	}

}
