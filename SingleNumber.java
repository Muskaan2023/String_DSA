class SingleNumber{
    public static int singleNumber(int[] nums) {
        
        int min=0;
        for(int i=0;i<nums.length;i++){
            min=min^nums[i];
        }
        return min;
        
    }
    public static void main(String[]args){
        int []nums={1,2,3,4,1,3,2};
        System.out.print(singleNumber(nums));
    }
}