package java07_4week;
import java.util.Scanner;

public class java0726_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Scanner sc = new Scanner(System.in);
		
		int age; //������� ����
		int fee; //���̰��� ���
		
		System.out.println("���̰� ��� �ǽó���? 0~12������ 1��� ����մϴ�.");
		age = sc.nextInt(); // age�� �ڷ����� ��ġ���Ѿ� ��.
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
		System.out.println("�̿��� : "+ fee +" �Դϴ�.");
	}
}
