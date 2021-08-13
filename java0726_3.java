package java07_4week;
import java.util.Scanner;

public class java0726_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Scanner sc = new Scanner(System.in);
		
		int age; //사용자의 나이
		int fee; //놀이공원 요금
		
		System.out.println("나이가 어떻게 되시나요? 0~12개월은 1살로 계산합니다.");
		age = sc.nextInt(); // age의 자료형과 일치시켜야 함.
		if( age < 8) {
			fee = 1000;
		}
		else if (age < 14) {
			fee = 2000;
		}
		else if (age < 20) {
			fee = 2500;
		}
		else if (age >= 60) {
			fee = 0;
		}
		else {
			fee = 3000;
		}
		System.out.println("이용료는 : "+ fee +" 입니다.");
	}
}
