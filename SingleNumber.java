class Solution {
    public int singleNumber(int[] a) {
        int result = 0;
    for (int number: a) {
       result ^= number; // Logical XOR operator 
    }
    return result;
    }
}
