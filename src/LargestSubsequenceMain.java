import java.util.ArrayList;
import java.util.Scanner;

public class LargestSubsequenceMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			LargestSubsequence largestSubsequence = new LargestSubsequence();
			System.out.println("Enter the limit");
			int limit = sc.nextInt();
			ArrayList<Integer> arrayList = largestSubsequence.GenerateSequence(limit);
			largestSubsequence.PrintArrayList(arrayList);
			largestSubsequence.findLargestSubsequence(arrayList);
		}catch(Exception ex) {
			System.err.println(ex.getStackTrace());
		}
		finally {
			sc.close();
		}
	}

}
