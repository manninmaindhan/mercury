package arrayprograms;

public class CountOfDuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 1, 1, 1, 2, 3, 2, 2, 3, 3, 3, 3, 4, 5, 6, 6, 6, 9 };
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int no = a[i];
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
            if (a[i] == a[j]) {
					count++;
					b[j] = -1;
				}
			}
			if (b[i] != -1) {
				b[i] = count;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (b[i] > 0) {
				System.out.println(a[i] + " present at " + b[i] + " times");
			}
		}
	}
}
