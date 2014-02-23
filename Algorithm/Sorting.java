package DataStructures;

public class Sorting {

	public static void main(String[] input) {

		int k = input.length;
		String temp = new String();
		String names[] = new String[k + 1];
		for (int i = 0; i < k; i++) {
			names[i] = input[i];
		}
		for (int i = 0; i < k; i++)
			for (int j = i + 1; j < k; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}

			}
		System.out.println("Order is"); 
		for(int i=0;i<k;i++) { System.out.println(names[i]); } 
	}

}
