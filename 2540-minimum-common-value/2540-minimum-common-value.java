class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       
        // Create HashSet for nums1
        HashSet<Integer> set1 = new HashSet<>();
        for (int value : nums1) {
            set1.add(value);
        }

        // Create HashSet for nums2
        HashSet<Integer> set2 = new HashSet<>();
        for (int value : nums2) {
            set2.add(value);
        }
        
        for(int i=0;i<nums1.length;i++){
            if(set1.contains(nums1[i]) && set2.contains(nums1[i])){
                return nums1[i];
            }
        }
        
        return -1;
    }
}