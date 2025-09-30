//For every two neighboring numbers in the list sub, when you add them together, it should always come out as either always odd or always even—not a mix
class FindMaxLengthOfValidSubsequence {
    int[] nums = {1,2,1,1,2,1,2};
    public int maximumLength(int[] nums) {
        //addition of neighbors is odd
        int i = 1;
        int x = nums.length;
        int[] sub = new int[x];


        if((nums[0] + nums[1]) % 2 == 1){
            sub[0] = nums[0];
            //check next neighbor numbers, add to subsequences if its odd, loop
            while(i < x){
                if((nums[i-1] + nums[i]) % 2 == 1){
                    sub[i] = nums[i];
                }
                i++;
            }
        }else{
            sub[0] = nums[0];
            //check next neighbor numbers, add to subsequences if its odd, loop
            while(i < x){
                if((nums[i-1] + nums[i]) % 2 == 0){
                    sub[i] = nums[i];
                }
                i++;
            }

        }
        return sub.length;
    }
}