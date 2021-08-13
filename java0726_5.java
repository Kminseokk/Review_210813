package java07_4week;
import java.util.Scanner;

public class java0726_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		char operator; //연산값
		int num1;
		int num2;
		double result;
		
		System.out.println("할 연산? + - * / ");
		operator = sc.next().charAt(0); // 변수의 자료형과 일치시켜야 함.
		
		// *****************************************************************************
		// 이 위치에서 숫자 두개를 입력받는다면, 코드는 짧아지지만, 연산자의 입력이 잘못되더라도 숫자를 입력받게 되므로
		// 연산자 검증 부터 한 후 숫자를 입력받았으며, 숫자 입력받는 것의 예외 처리는 하지 않았음. 숫자가 아닌 값 처리 X
		// *****************************************************************************

		
		switch( operator) {
			case '+':
				System.out.println("숫자 두개 입력");
				num1 = sc.nextInt(); 
				num2 = sc.nextInt(); 
				result = num1 + num2;
				System.out.println("선택한 연산자는 "+operator+" 이고 값은 "+result+" 에요.");
				break;
			case '-':
				System.out.println("숫자 두개 입력");
				num1 = sc.nextInt(); 
				num2 = sc.nextInt(); 
				result = num1 - num2;
				System.out.println("선택한 연산자는 "+operator+" 이고 값은 "+result+" 에요.");
				break;
			case '*':
				System.out.println("숫자 두개 입력");
				num1 = sc.nextInt(); 
				num2 = sc.nextInt(); 
				result = num1 * num2;
				System.out.println("선택한 연산자는 "+operator+" 이고 값은 "+result+" 에요.");
				break;
			case '/':
				System.out.println("숫자 두개 입력");
				num1 = sc.nextInt(); 
				num2 = sc.nextInt(); 
				result = num1 / num2;
				System.out.println("선택한 연산자는 "+operator+" 이고 값은 "+result+" 에요.");
				break;
			default:
				System.out.println("잘못 입력했어요");
		}
//		
//		if ( operator == '+') {
//			System.out.println("숫자 두개 입력");
//			num1 = sc.nextInt(); 
//			num2 = sc.nextInt(); 
//			result = num1 + num2;
//			System.out.println("선택한 연산자는 "+operator+" 이고 값은 "+result+" 에요.");
//		}
//		else if ( operator == '-') {
//			System.out.println("숫자 두개 입력");
//			num1 = sc.nextInt(); 
//			num2 = sc.nextInt(); 
//			result = num1 - num2;
//			System.out.println("선택한 연산자는 "+operator+" 이고 값은 "+result+" 에요.");
//		}
//		else if ( operator == '*') {
//			System.out.println("숫자 두개 입력");
//			num1 = sc.nextInt(); 
//			num2 = sc.nextInt(); 
//			result = num1 * num2;
//			System.out.println("선택한 연산자는 "+operator+" 이고 값은 "+result+" 에요.");
//		}
//		else if ( operator == '/') {
//			System.out.println("숫자 두개 입력");
//			num1 = sc.nextInt(); 
//			num2 = sc.nextInt(); 
//			result = num1 / num2;
//			System.out.println("선택한 연산자는 "+operator+" 이고 값은 "+result+" 에요.");
//		}
//		else
//			System.out.println("잘못 입력했어요");
	}

}
