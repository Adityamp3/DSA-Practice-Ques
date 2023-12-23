class RotatedSortedArray {
    public int search(int[] nums, int target) {
        int p,q,val=0,count=0;
        int len = nums.length;
        if(len==1){
            if(nums[0]==target)
                val=0;
            else
                val=-1;
        }
        else{
            for(int i=0; i<len; i++){
                p=nums[i];
                q=nums[len-1-i];
                if(p==target && q!=target){
                    count+=1;
                    val=i;
                    break;
                }
                if(q==target && p!=target){
                    count+=1;
                    val=len-1-i;
                    break;
                }
                if(p==target && q==target){
                    count+=1;
                    val=i;
                    break;
                }
            }
            if(count!=1)
                val=-1;
        }
        return val;
    }
}