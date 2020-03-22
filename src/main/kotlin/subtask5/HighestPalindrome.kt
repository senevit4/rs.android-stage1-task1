package subtask5

class HighestPalindrome {

    private val NINE = 9

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var digits = digitString.toCharArray()
        var counter = k
        var leftCounter = 0
        var rightCounter = n - 1
        while(leftCounter <= rightCounter){
            if (digits[leftCounter].toInt() != digits[rightCounter].toInt()) {
                if(digits[leftCounter].toInt() > digits[rightCounter].toInt())
                    digits[rightCounter] = digits[leftCounter]
                else digits[leftCounter] = digits[rightCounter]
                counter--
            }

            leftCounter++
            rightCounter--

            if(leftCounter == rightCounter && counter > 0)
                digits[leftCounter] = NINE.toChar()
        }

        if (counter < 0) {
            return "-1"
        }
        var palindrome = ""
        for (digit in digits) {
            palindrome+=digit
        }

        return palindrome
    }
}
