package algorithm.self01.test;

public class Prob2 {

	public static void main(String[] args) {
		int [] nums={57,5,10,7,63,9};
		sort(nums,1);//오름차순 정렬

		for(int i=0; i<nums.length; i++){
			System.out.println(nums[i]);
		}
		System.out.println("=====================");
		
		sort(nums,2);//내림차순 정렬
		for(int i=0; i<nums.length; i++){
			System.out.println(nums[i]);
		}
	}

	private static void sort(int[] nums, int orderby) {
		// 문제에 맞게 구현하시오.
		boolean sort = false;
		int temp = nums[0];  
		for(int j=0; j<nums.length; j++){
			for(int i =0; i<nums.length; i++){
				if(orderby ==1){
					sort = nums[j] < nums[i];
				}else{
					sort = nums[j] > nums[i];
				}
				if(sort){
					temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		for(int j=0; j<nums.length; j++){
			for(int i =0; i<nums.length; i++){
				if(orderby ==1){
					sort = nums[j] > nums[i];
				}else{
					sort = nums[j] < nums[i];
				}
				if(sort){
					temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
	}
}
