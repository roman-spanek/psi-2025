
class Functions {
private final int LOWEST = 10;
private final int HIGHEST = 100;

	int add (int a, int b) {
		if (a <  LOWEST || b > HIGHEST ){
			System.out.println("Value a is lower then a threshold or value b is large then threshholt");
			return 0;
		}
		return a + b;
	}
}



