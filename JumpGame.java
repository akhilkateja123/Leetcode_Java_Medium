
public class JumpGame {
	
	static boolean flag=false;

	public static void main(String[] args) {
		System.out.println(canJump(new int[]{0}));
	}

	public static boolean canJump(int[] nums) {
		
		if(nums==null || nums.length==0) return false;

		for (int i = nums[0]; i >= 0; i--) {

			if (jump(0, i, nums))
				return true;
		}

		return false;
	}

	private static boolean jump(int index, int element, int[] nums) {

		index = index + element;

		if (index >= nums.length - 1)
			flag= true;

		while (!flag && nums[index] > 0 ) {
			jump(index, nums[index], nums);
			nums[index]--;
		}

		return flag;

	}

}
