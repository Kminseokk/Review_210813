package java07_4week;
import java.util.Scanner;

public class java0726_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int floor; //����
		
		System.out.println("������ �����ΰ���?");
		floor = sc.nextInt(); // ������ �ڷ����� ��ġ���Ѿ� ��.
		
		switch (floor) {
		case 1:
			System.out.println("1���� �౹�̿���.");
			break;
		case 2:
			System.out.println("2���� �����ܰ��̿���.");
			break;
		case 3:
			System.out.println("3���� �Ǻΰ��̿���.");
			break;
		case 4:
			System.out.println("4���� ġ���̿���.");
			break;
		case 5:
			System.out.println("5���� �ｺŬ���̿���.");
			break;
		default:
			System.out.println("�ش� ������ �����.");
			break;
		}
		
	}

}
