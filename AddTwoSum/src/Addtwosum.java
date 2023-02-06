public class Addtwosum {
    public static void main(String[] args) {
        int arr[] = {3,1,2};
        twoSum(arr, 5);

    }

    public static int[] twoSum( int[] nums, int target){
        for (int i = 0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                int complement = target - nums[i];

                if(nums[j] == complement){
                    System.out.println(i+" "+j);
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("no match found");
    }
}
