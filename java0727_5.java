package java07_4week;
import java.util.Scanner;

// Average_Calculator_Grade_While Project 16-1 �ǽ� ������ while �ݺ����� �̿��� ������ ���ϱ�

public class java0727_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//0������ ���� 100�̻��� ���� ����ó�� ����.
		int a;
		int b;
		int c;
		int d;
		double e;
		boolean loop = true;
		
		String grade = "";
		
		System.out.println("���� �Է�");
		System.out.println("���� �Է�");
		a = sc.nextInt(); // name�� �ڷ����� ��ġ���Ѿ� ��.
		System.out.println("���� �Է�");
		b =  sc.nextInt();
		System.out.println("���� �Է�");
		c =  sc.nextInt();
		System.out.println("���α׷��� �Է�");
		d =  sc.nextInt();
		
		e = (double)(a+b+c+d)/4;
		//System.out.println("���"+ e);
		
		while ( loop == true) {
			if(e >= 95) {
				grade = "A+";
				loop = false;
			}
			else if (e >= 90) {
				grade = "A";
				loop = false;
			}
			else if (e >= 85) {
				grade = "B+";
				loop = false;
			}
			else if (e >= 80) {
				grade = "B";
				loop = false;
			}
			else if (e >= 70) {
				grade = "C";
				loop = false;
			}
			else if (e >= 60) {
				grade = "D";
				loop = false;
			}
			else {
				grade = "F";
				loop = false;
			}
		}
	
		System.out.println("���"+ e);
		System.out.println("����"+ grade);

	}

}
