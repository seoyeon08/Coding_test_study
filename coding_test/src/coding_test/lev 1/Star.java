import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt(); //����
		int m = scan.nextInt(); //����
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
