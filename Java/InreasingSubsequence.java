
import java.util.ArrayList;

class InreasingSubsequence {

	public static int[] array = {0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};

	public static void main(String[] args) {
		System.out.println(getIncreasingSubsequence(array));
	}

	static public ArrayList<Integer> getIncreasingSubsequence(int[] arr) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();

		for (int i = 1; i<= arr.length-1; i++) {
			if (arr[i] > arr[i-1]) {
				temp.add(arr[i]);
			} else {
				if (returnList.size() < temp.size()) {
					returnList = temp;
					temp.clear();
				}
			}
		}
		return returnList;

	}

}