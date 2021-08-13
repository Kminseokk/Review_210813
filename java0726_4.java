package java07_4week;
import java.util.Scanner;

public class java0726_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int floor; //층수
		
		System.out.println("층수는 몇층인가여?");
		floor = sc.nextInt(); // 변수의 자료형과 일치시켜야 함.
		
		switch (floor) {
		case 1:
			System.out.println("1층은 약국이에요.");
			break;
		case 2:
			System.out.println("2층은 정형외과이에요.");
			break;
		case 3:
			System.out.println("3층은 피부과이에요.");
			break;
		case 4:
			System.out.println("4층은 치과이에요.");
			break;
		case 5:
			System.out.println("5층은 헬스클럽이에요.");
			break;
		default:
			System.out.println("해당 층수는 없어요.");
			break;
		}
		
	}

}
