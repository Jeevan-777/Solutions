class leetCode2540 {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i]; 
            }
            if (nums1[i] < nums2[j]) {
                i++; 
            } else {
                j++; 
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        leetCode2540 solution = new leetCode2540();
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {3, 4, 5, 6, 7};
        int commonElement = solution.getCommon(nums1, nums2);
        System.out.println(commonElement);
    }
}
