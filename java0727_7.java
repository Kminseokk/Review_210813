package java07_4week;
import java.util.Scanner;

/* Average_Calculator_Grade_Infinite_Loop Project
실습 예제 2번에 무한반복을 적용하세요
사용자가 ”keep” 을 입력하면 반복을 수행(학점 구하기)하고
사용자가 “quit” 을 입력하면 무한반복이 종료되게 하세요. */

public class java0727_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//0이하의 점수 100이상의 점수 예외처리 안함.
		int a; //수학
		int b; //국어
		int c; //영어
		int d; //프로그래밍
		double e; //평균
		String KeepOrExit = ""; //사용자의 의사(유지 및 중단)을 저장함
		String grade = ""; //학점
	
		for( ;; ) {
			
			if (KeepOrExit.equalsIgnoreCase("")) { //이걸 안하면 System.out.println("입력을 잘못했어요 : " +KeepOrExit ); 가 실행됨
				System.out.println("계속 하시려면 \"keep\"을 중단하시려면 \"quit\"를 입력해주세요.");
				KeepOrExit = sc.nextLine();
				//System.out.println(KeepOrExit); //KeepOrExit에 저장이 되는지 확인하는 용도
			}
			
			else if (KeepOrExit.equalsIgnoreCase("quit"))
				break;
			
			else if (KeepOrExit.equalsIgnoreCase("keep")) {
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
			
				System.out.println("평균 : "+ e);
				System.out.println("학점 : "+ grade);
				System.out.println("*****refresh*****");
				KeepOrExit = "";
			}	
			else if (!KeepOrExit.equalsIgnoreCase("keep")&&!(KeepOrExit.equalsIgnoreCase("quit")
					&&!(KeepOrExit.equalsIgnoreCase("")))) {
				System.out.println("입력을 잘못했어요 : " +KeepOrExit );
				KeepOrExit = "";
			}
		
				
		} // for문 무한반복문 닫기
	}
}
