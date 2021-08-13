package java07_4week;
import java.util.Scanner;

public class HelloWolrd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double fahrenheit; //화씨
		double degree; //섭씨
		
		int name;
		
		System.out.println("변환할 것. 섭씨에서 화씨(1), 화씨에서 섭씨(2)");
		name = sc.nextInt(); // name의 자료형과 일치시켜야 함.
		
		if( name == 1 ) {
			System.out.println("선택한 것은 섭씨에서 화씨로");
			System.out.println("섭씨 몇도 인가요?");
			degree = sc.nextDouble(); // name의 자료형과 일치시켜야 함.
			fahrenheit = (degree * 1.8) + 32;
			System.out.println("섭씨에서 화씨 바꾸면 "+ fahrenheit + " 에용.");
		}		
		if( name == 2 ) {
			System.out.println("선택한 것은 화씨에서 섭씨로");
			System.out.println("화씨 몇도 인가요?");
			fahrenheit = sc.nextDouble(); // name의 자료형과 일치시켜야 함.
			degree = (fahrenheit - 32) / 1.8;
			System.out.println("섭씨에서 화씨 바꾸면 "+ degree + " 에용.");
		}
		else
			System.out.println("이상한거 누르지마세용");		
	}

}
