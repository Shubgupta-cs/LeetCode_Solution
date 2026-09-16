class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int n : nums1) set1.add(n);
        for(int n : nums2) set2.add(n);
        int c1 = 0,c2=0;
        for(int num : nums1){
            if(set2.contains(num)) c1++;
        }
        for(int num : nums2){
            if(set1.contains(num)) c2++;
        }
        return new int[]{c1,c2};
    }
}