class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // Iterate over the array.
        for (int i = 0; i < letters.length; i++) {
            // Compare lexicography of letter to target, return if greater.
            if (letters[i] > target) {
                return letters[i];
            }
        }
        // Return the first character in letters otherwise.
        return letters[0];
    }
}