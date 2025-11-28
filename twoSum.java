
public class twoSum {

	public static void main(String[] args) {
		
     int [] nums = new int[] {3,4,5,6,7,8};
     int target = 9;
     int[] sonuc = twoSumMethod(nums,target);
     System.out.print("["+sonuc[0]+","+ sonuc[1]+"]");
		 
	}
	public static int [] twoSumMethod(int []nums, int target) {
		for(int i =0;i< nums.length;i++) {
			for(int j=i+1;j< nums.length; j++) {
				if(nums[j]+nums[i] == target) {
					return new int[] {i, j};
				}
			}
		}
		return new int[] {-1, -1};
	}

}
