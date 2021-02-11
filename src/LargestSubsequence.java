import java.util.ArrayList;
import java.util.Random;

public class LargestSubsequence {
	
 //Method to generate random sequence
 public ArrayList<Integer> GenerateSequence(int limit){
	 ArrayList<Integer> arrayList = new ArrayList<Integer>();
	 Random random = new Random();
	 for(int i=0;i<limit;i++) {
		 arrayList.add(random.nextInt(limit)+1);
	 }
	 return arrayList;
 }
 
 //Method to print items in arrayList
 public void PrintArrayList(ArrayList<Integer> arrayList) {
	 System.out.println("The genereated random sequence is :");
	 for(int i = 0; i<arrayList.size(); i++) {
		 System.out.print(arrayList.get(i)+" ");
	 }
 }
 
 //Method to find largest subsequence
 public void findLargestSubsequence(ArrayList<Integer> arrayList) {
	 int count = 1;
	 int startingIndex = 0;
	 int endingIndex = 0;
	 int maxCount = 1;
	 int maxStartingIndex = 0;
	 int maxEndingIndex = 0;
	 short flag = 0;
	 for(int i = 0; i<arrayList.size()-1; i++) {
		 if(arrayList.get(i+1) > arrayList.get(i)) {
			 count++;
			 endingIndex = i+1;
			 
			 if(flag == 0) {
				 maxCount++;
				 maxEndingIndex = i+1;
			 }
			 if(flag == 1 && count>maxCount) {
				 maxCount = count;
				 maxStartingIndex = startingIndex;
				 maxEndingIndex = endingIndex;
			 }
		 }
		 else {
			 count = 1;
			 startingIndex = i+1;
			 endingIndex = i+1;
			 flag = 1;
		 }
	 }
	 if(maxCount>1) {
		 System.out.println("\nThe highest subsequence is :");
		 for(int i = maxStartingIndex; i <= maxEndingIndex; i++) {
			 System.out.print(arrayList.get(i)+" ");
		 }
	 }
	 else {
		 System.out.println("\nNo sequence found!");
	 }
 }
}
