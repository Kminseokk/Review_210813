package java07_4week;
import java.util.Scanner;

public class java0726_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		char operator; //���갪
		int num1;
		int num2;
		double result;
		
		System.out.println("�� ����? + - * / ");
		operator = sc.next().charAt(0); // ������ �ڷ����� ��ġ���Ѿ� ��.
		
		// *****************************************************************************
		// �� ��ġ���� ���� �ΰ��� �Է¹޴´ٸ�, �ڵ�� ª��������, �������� �Է��� �߸��Ǵ��� ���ڸ� �Է¹ް� �ǹǷ�
		// ������ ���� ���� �� �� ���ڸ� �Է¹޾�����, ���� �Է¹޴� ���� ���� ó���� ���� �ʾ���. ���ڰ� �ƴ� �� ó�� X
		// *****************************************************************************

		
		switch( operator) {
			case '+':
				System.out.println("���� �ΰ� �Է�");
				num1 = sc.nextInt(); 
				num2 = sc.nextInt(); 
				result = num1 + num2;
				System.out.println("������ �����ڴ� "+operator+" �̰� ���� "+result+" ����.");
				break;
			case '-':
				System.out.println("���� �ΰ� �Է�");
				num1 = sc.nextInt(); 
				num2 = sc.nextInt(); 
				result = num1 - num2;
				System.out.println("������ �����ڴ� "+operator+" �̰� ���� "+result+" ����.");
				break;
			case '*':
				System.out.println("���� �ΰ� �Է�");
				num1 = sc.nextInt(); 
				num2 = sc.nextInt(); 
				result = num1 * num2;
				System.out.println("������ �����ڴ� "+operator+" �̰� ���� "+result+" ����.");
				break;
			case '/':
				System.out.println("���� �ΰ� �Է�");
				num1 = sc.nextInt(); 
				num2 = sc.nextInt(); 
				result = num1 / num2;
				System.out.println("������ �����ڴ� "+operator+" �̰� ���� "+result+" ����.");
				break;
			default:
				System.out.println("�߸� �Է��߾��");
		}
//		
//		if ( operator == '+') {
//			System.out.println("���� �ΰ� �Է�");
//			num1 = sc.nextInt(); 
//			num2 = sc.nextInt(); 
//			result = num1 + num2;
//			System.out.println("������ �����ڴ� "+operator+" �̰� ���� "+result+" ����.");
//		}
//		else if ( operator == '-') {
//			System.out.println("���� �ΰ� �Է�");
//			num1 = sc.nextInt(); 
//			num2 = sc.nextInt(); 
//			result = num1 - num2;
//			System.out.println("������ �����ڴ� "+operator+" �̰� ���� "+result+" ����.");
//		}
//		else if ( operator == '*') {
//			System.out.println("���� �ΰ� �Է�");
//			num1 = sc.nextInt(); 
//			num2 = sc.nextInt(); 
//			result = num1 * num2;
//			System.out.println("������ �����ڴ� "+operator+" �̰� ���� "+result+" ����.");
//		}
//		else if ( operator == '/') {
//			System.out.println("���� �ΰ� �Է�");
//			num1 = sc.nextInt(); 
//			num2 = sc.nextInt(); 
//			result = num1 / num2;
//			System.out.println("������ �����ڴ� "+operator+" �̰� ���� "+result+" ����.");
//		}
//		else
//			System.out.println("�߸� �Է��߾��");
	}

}
