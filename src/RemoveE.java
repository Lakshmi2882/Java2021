public class RemoveE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {0,1,2,2,3,0,4,2};//0,1,3,0,4
		int val=2;
		int j=0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=val)
			{
				nums[j]=nums[i];
				j++;
			}
		}
		System.out.println(j);
	}

}
