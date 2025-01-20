package codingQ;

public class MissingNumber {

	public static void main(String[] args) {
		int nums[] = { 3, 0, 1,2,4,5,7 };
		System.out.println("Missing number: " + missingnum(nums));
	}

	public static int missingnum(int nums[]) {
		int sum = 0;
		for (int i = 0; i <= nums.length-1; i++) {
			sum = sum + nums[i];
		}
		int actualSum = (nums.length * (nums.length + 1)) / 2;
		return actualSum - sum;
	}
}
  