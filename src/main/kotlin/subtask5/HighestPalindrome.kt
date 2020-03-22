package subtask5

class HighestPalindrome {

    private val NINE = 9

    // TODO: Improve the solution
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
                digits[leftCounter] = '9'
        }

        if (counter < 0) {
            return "-1"
        }

        leftCounter = 0
        rightCounter = n - 1

        while(leftCounter <= rightCounter){
             if (digits[leftCounter].toString().toInt() < NINE) {
                 if(counter >= 2) {
                     digits[leftCounter] = '9'
                     digits[rightCounter] = '9'
                     counter -= 2
                 } else {
                     if (counter >=1 &&
                         (digits[leftCounter] != digitString[leftCounter] ||
                         digits[rightCounter] != digitString[rightCounter])) {
                         digits[leftCounter] = '9'
                         digits[rightCounter] = '9'
                         counter--
                     }
                 }
             }

            leftCounter++
            rightCounter--

        }


        var palindrome = ""
        for (digit in digits) {
            palindrome+=digit
        }

        return palindrome
    }
}
