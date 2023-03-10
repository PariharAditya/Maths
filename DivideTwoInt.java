class Solution {
    public int divide(int dividend, int divisor) {
        if((dividend == -2147483648)&&(divisor == -1)) return 2147483647;



        // /Determine the sign of the result
    boolean negative = (dividend < 0) ^ (divisor < 0);

    // Convert both dividend and divisor to positive numbers
    long dvd = Math.abs((long) dividend);
    long dvs = Math.abs((long) divisor);

         int result = 0;
    while (dvd >= dvs) {
        // Determine the largest multiple of the divisor that can be subtracted from the dividend
        int shift = 0;
        while (dvd >= (dvs << shift)) {
            shift++;
        }
        shift--;

        // Subtract the largest multiple of the divisor from the dividend
        dvd -= (dvs << shift);

        // Update the quotient
        result += (1 << shift);
    }

    return negative ? -result : result;
}
}