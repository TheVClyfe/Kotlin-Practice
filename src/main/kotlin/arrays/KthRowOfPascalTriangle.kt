package arrays

import DSAPractice

/**
 *
 *
    Problem Description

    Given an index k, return the kth row of the Pascal's triangle.
    Pascal's triangle: To generate A\[C] in row R, sum up A'\[C] and A'[C-1] from previous row R - 1.

    Example:

    Input : k = 3


    Return : [1,3,3,1]

    Note: k is 0 based. k = 0, corresponds to the row [1].

    Note: Could you optimize your algorithm to use only O(k) extra space?
 *
 */

class KthRowOfPascalTriangle: DSAPractice {
    override fun code() {
        val inputRow = 15
        if(inputRow==0) {
            print(1)
        } else if(inputRow==1) {
            print(listOf(1,1))
        }
        var prev = mutableListOf(1,1)
        val curr: MutableList<Int> = mutableListOf()
        for(i in 2..inputRow) {
            curr.clear()
            curr.add(1)
            for(j in 1 until prev.size) {
                curr.add(prev[j]+prev[j-1])
            }
            curr.add(1)
            prev = curr.toMutableList()
        }
        print(prev)
    }
}