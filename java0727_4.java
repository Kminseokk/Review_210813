package java07_4week;
// ********************* 구구단 단보다 곱하는 수가 작거나 같은 경우까지만  ************************* //

public class java0727_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i<=9; i++ ) {
			for( int j=1; j<=i; j++) {
				System.out.println( i + "*" + j + "=" + i*j);
			}
		}
	}

}
