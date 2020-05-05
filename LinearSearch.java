import java.util.Scanner;

class Array {
	public int len;
	public int[] content;
	public Array(int len, int[] content) {
		this.len = len;
		this.content = content;
	}
	public String toString() {
		String result = "[";
		for (int i=0; i<this.len; i++) {
			result += Integer.toString(this.content[i]);
			if (i < this.len - 1) {
				result += ", ";
			}
		}
		result += "]";
		return result;
	}
}

class LinearSearch {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		int[] given = {49, 99, 45, 57, 64, 95, 81, 69, 11, 97, 6, 85, 61, 88, 29, 65, 83, 88, 45, 88};
		Array arr = new Array(20,given);
		System.out.println(arr);
		System.out.print("Enter number to search for, -1 to quit: ");
		int term = user.nextInt();
		boolean found = false;
		if (term != -1) {
			for (int i=0; i<arr.len; i++) {
				if (arr.content[i] == term) {
					System.out.print("Found in position ");
					System.out.println(i);
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("Not found.");
			}
		}
	}
}