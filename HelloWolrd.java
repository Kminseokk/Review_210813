package java07_4week;
import java.util.Scanner;

public class HelloWolrd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double fahrenheit; //ȭ��
		double degree; //����
		
		int name;
		
		System.out.println("��ȯ�� ��. �������� ȭ��(1), ȭ������ ����(2)");
		name = sc.nextInt(); // name�� �ڷ����� ��ġ���Ѿ� ��.
		
		if( name == 1 ) {
			System.out.println("������ ���� �������� ȭ����");
			System.out.println("���� � �ΰ���?");
			degree = sc.nextDouble(); // name�� �ڷ����� ��ġ���Ѿ� ��.
			fahrenheit = (degree * 1.8) + 32;
			System.out.println("�������� ȭ�� �ٲٸ� "+ fahrenheit + " ����.");
		}		
		if( name == 2 ) {
			System.out.println("������ ���� ȭ������ ������");
			System.out.println("ȭ�� � �ΰ���?");
			fahrenheit = sc.nextDouble(); // name�� �ڷ����� ��ġ���Ѿ� ��.
			degree = (fahrenheit - 32) / 1.8;
			System.out.println("�������� ȭ�� �ٲٸ� "+ degree + " ����.");
		}
		else
			System.out.println("�̻��Ѱ� ������������");		
	}

}
