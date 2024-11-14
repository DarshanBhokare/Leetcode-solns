class Solution {
    public int firstMissingPositive(int[] nums) {

        HashSet<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            numbers.add(num);
        }

      
        int missingNumber = 1;
        while (numbers.contains(missingNumber)) {
            missingNumber++;
        }

        return missingNumber;
    }
}