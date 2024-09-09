public class SingleNumberFinder {
    public static int singleNumber(int[] nums) {
        int result = 0; // The unique number to find

        // Loop through each bit position from 0 to 31 (for 32-bit integers)
        for (int i = 0; i < 32; i++) {
            int bitCount = 0; // Count the number of 1s at the ith bit position

            // Count the number of 1s for the current bit position across all numbers
            for (int num : nums) {
                if ((num >> i & 1) == 1) {  // Check if the ith bit is set in num
                    bitCount++;
                }
            }

            // If the bit count is not divisible by 3, it must belong to the unique number
            if (bitCount % 3 != 0) {
                result |= (1 << i); // Set the ith bit in the result
            }
        }

        return result; // The single number that appears once
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3};
        System.out.println("Single number is: " + singleNumber(nums)); // Output: 3

        int[] nums2 = {0, 1, 0, 1, 0, 1, 99};
        System.out.println("Single number is: " + singleNumber(nums2)); // Output: 99
    }
}
