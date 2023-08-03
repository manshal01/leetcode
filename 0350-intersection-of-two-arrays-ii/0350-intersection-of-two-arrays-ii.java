class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Sort both input arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0, j = 0;  // Pointers for iterating through the arrays
        List<Integer> intersection = new ArrayList<>();
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                intersection.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        
       
        int[] result = new int[intersection.size()];
        for (int k = 0; k < intersection.size(); k++) {
            result[k] = intersection.get(k);
        }
        
        return result;
    }
}
