
public class loopGaunlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}

		for (int a = 100; a > 0; a--) {
			System.out.println(a);
		}

		for (int c = 2; c < 101; c++) {
			System.out.println(c);
		}
		for (int b = 2; b < 101; b++) {
			if (b % 2 == 0) {
				System.out.println(b);

			}
		}
		for (int d = 2; d < 101; d++) {
			if (d % 2 == 1) {
				System.out.println(d);
			}

		}
		for (int d = 2; d < 101; d++) {
			if (d % 2 == 1) {
				System.out.println(d + "odd");
			} else {
				System.out.println(d + "even");

			}
		}
		for (int r = 7; r < 778; r++) {
			if (r % 7 == 0) {
				System.out.println(r);

			}
		}
		for (int o = 0; o < 3; o++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(o+" "+j);
			}
		}
	}
}