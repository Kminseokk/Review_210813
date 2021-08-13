package java07_4week;
import java.util.Scanner;

// Average_Calculator_Grade_While Project 16-1 실습 예제를 for 반복문을 이용해 학점을 구하기

public class java0727_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//0이하의 점수 100이상의 점수 예외처리 안함.
		int a;
		int b;
		int c;
		int d;
		double e;
		boolean loop = true;
		
		String grade = "";
		
		System.out.println("점수 입력");
		System.out.println("수학 입력");
		a = sc.nextInt(); // name의 자료형과 일치시켜야 함.
		System.out.println("국어 입력");
		b =  sc.nextInt();
		System.out.println("여어 입력");
		c =  sc.nextInt();
		System.out.println("프로그래밍 입력");
		d =  sc.nextInt();
		
		e = (double)(a+b+c+d)/4;
		//System.out.println("평균"+ e);
		
		for ( ;; ){
			if(e >= 95) {
				grade = "A+";
				break;
			}
			else if (e >= 90) {
				grade = "A";
				break;
			}
			else if (e >= 85) {
				grade = "B+";
				break;
			}
			else if (e >= 80) {
				grade = "B";
				break;
			}
			else if (e >= 70) {
				grade = "C";
				break;
			}
			else if (e >= 60) {
				grade = "D";
				break;
			}
			else {
				grade = "F";
				break;
			}
		}
	
		System.out.println("평균"+ e);
		System.out.println("학점"+ grade);

	}

}
