package java07_4week;
import java.util.Scanner;

/* Average_Calculator_Grade_Infinite_Loop Project
�ǽ� ���� 2���� ���ѹݺ��� �����ϼ���
����ڰ� ��keep�� �� �Է��ϸ� �ݺ��� ����(���� ���ϱ�)�ϰ�
����ڰ� ��quit�� �� �Է��ϸ� ���ѹݺ��� ����ǰ� �ϼ���. */

public class java0727_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//0������ ���� 100�̻��� ���� ����ó�� ����.
		int a; //����
		int b; //����
		int c; //����
		int d; //���α׷���
		double e; //���
		String KeepOrExit = ""; //������� �ǻ�(���� �� �ߴ�)�� ������
		String grade = ""; //����
	
		for( ;; ) {
			
			if (KeepOrExit.equalsIgnoreCase("")) { //�̰� ���ϸ� System.out.println("�Է��� �߸��߾�� : " +KeepOrExit ); �� �����
				System.out.println("��� �Ͻ÷��� \"keep\"�� �ߴ��Ͻ÷��� \"quit\"�� �Է����ּ���.");
				KeepOrExit = sc.nextLine();
				//System.out.println(KeepOrExit); //KeepOrExit�� ������ �Ǵ��� Ȯ���ϴ� �뵵
			}
			
			else if (KeepOrExit.equalsIgnoreCase("quit"))
				break;
			
			else if (KeepOrExit.equalsIgnoreCase("keep")) {
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
	
				if(e >= 95) {
					grade = "A+";	
				}
				else if (e >= 90) {
					grade = "A";
				}
				else if (e >= 85) {
					grade = "B+";
				}
				else if (e >= 80) {
					grade = "B";
				}
				else if (e >= 70) {
					grade = "C";
				}
				else if (e >= 60) {
					grade = "D";
				}
				else
					grade = "F";				
			
				System.out.println("��� : "+ e);
				System.out.println("���� : "+ grade);
				System.out.println("*****refresh*****");
				KeepOrExit = "";
			}	
			else if (!KeepOrExit.equalsIgnoreCase("keep")&&!(KeepOrExit.equalsIgnoreCase("quit")
					&&!(KeepOrExit.equalsIgnoreCase("")))) {
				System.out.println("�Է��� �߸��߾�� : " +KeepOrExit );
				KeepOrExit = "";
			}
		
				
		} // for�� ���ѹݺ��� �ݱ�
	}
}
