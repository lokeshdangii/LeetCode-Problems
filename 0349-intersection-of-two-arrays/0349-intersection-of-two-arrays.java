class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length; int m = nums2.length;
        // int res[] = new int[Math.max(n,m)];
        ArrayList<Integer> result = new ArrayList<>();
        // int idx = 0;

        HashSet<Integer> hs = new HashSet<>();  // Set

        // insertin elements of nums1 in set
        for(int i=0;i<n;i++){
            hs.add(nums1[i]);
        }

        for(int j=0;j<m;j++){
            if(hs.contains(nums2[j])){
                result.add(nums2[j]);
                hs.remove(nums2[j]);  
            }
        }

        // Convert ArrayList to int array
        int[] res = result.stream().mapToInt(Integer::intValue).toArray();
            
        return res; 
    }
}