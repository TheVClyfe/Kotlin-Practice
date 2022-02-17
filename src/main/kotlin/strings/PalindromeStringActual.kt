package strings

import DSAPractice

/**
 *
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Example:
 *
 * "A man, a plan, a canal: Panama" is a palindrome.
 *
 * "race a car" is not a palindrome.
 *
 */

class PalindromeStringActual: DSAPractice {
    override fun code() {
        val input = "A man, a plan, a canal: Panama"
        val charArr: MutableList<Char> = mutableListOf()
        //to parse out the spaces
        for(i in input.indices) {
            if(input[i].isLetter()) {
                charArr.add(input[i].lowercaseChar())
            } else if(input[i].isDigit()) {
                charArr.add(input[i])
            }
        }

        var isPalindrome = true
        for(i in 0 until charArr.size/2) {
            if(charArr[i]!=charArr[charArr.size-1-i]) {
                isPalindrome = false
                break
            }
        }
        print("\"$input\" ${if(isPalindrome) "is" else "is not"} a palindrome")
    }
}