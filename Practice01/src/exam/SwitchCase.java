package exam;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("엘리베이터 버튼을 눌러주세요.");

		Scanner sc = new Scanner(System.in);
		int lyr = sc.nextInt();
		
		switch(lyr) {
		case 1 : System.out.println(lyr + "층 약국입니다.");
		break;
		case 2 : System.out.println(lyr + "층 정형외과입니다.");
		break;
		case 3 : System.out.println(lyr + "층 피부과입니다.");
		break;
		case 4 : System.out.println(lyr + "층 치과입니다.");
		break;
		case 5 : System.out.println(lyr + "층 헬스 클럽입니다.");
		}
	}

}
