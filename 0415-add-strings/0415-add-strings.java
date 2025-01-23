class Solution {
    public String addStrings(String num1, String num2) {
        // Initialize result and carry
        StringBuilder result = new StringBuilder();
        int carry = 0;

        // Start from the rightmost digit and move left
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        // Loop until both strings are processed or carry remains
        while (i >= 0 || j >= 0 || carry != 0) {
            // Get current digits (if available)
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            // Calculate the sum of digits and carry
            int sum = digit1 + digit2 + carry;

            // The new carry
            carry = sum / 10;

            // Append the current digit to the result
            result.append(sum % 10);

            // Move to the next digits
            i--;
            j--;
        }

        // The result is in reverse order, so reverse it
        return result.reverse().toString();
    }
}
