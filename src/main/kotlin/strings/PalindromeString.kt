package strings

import DSAPractice

class PalindromeString: DSAPractice {
    override fun code() {
        val input = "InputtupnI"
        var isPalindrome = true
        for(i in 0 until input.length/2) {
            if(input[i]!=input[input.length-1-i]) {
                isPalindrome = false
                break
            }
        }
        print("$input ${if(isPalindrome) "is" else "is not"} a palindrome")
    }
}