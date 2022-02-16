package arrays

import DSAPractice
import kotlin.math.abs
import kotlin.math.pow

/**
 * Given a sorted array A containing N integers both positive and negative.
 * You need to create another array containing the squares of all the elements in A and return it in non-decreasing order.
 * Try to this in O(N) time.
 */

class SortArrayWithSquares: DSAPractice  {
    override fun code() {
        val input = arrayOf(-5, -4, -2, 0, 1)
        val res: MutableList<Int> = mutableListOf()
        var firstPos = 0
        while(input[firstPos]<0) {
            firstPos++
        }
        var leftPos = firstPos-1
        while(firstPos<input.size && leftPos>=0) {
            val right = abs(input[firstPos]).toFloat()
            val left = abs(input[leftPos]).toFloat()
            if(left < right) {
                res.add(left.pow(2).toInt())
                leftPos--
            } else {
                res.add(right.pow(2).toInt())
                firstPos++
            }
        }
        if(leftPos<0) {
            while(firstPos<input.size) {
                res.add(abs(input[firstPos]).toFloat().pow(2).toInt())
                firstPos++
            }
        } else if(firstPos==input.size) {
            while(leftPos>=0) {
                res.add(abs(input[leftPos]).toFloat().pow(2).toInt())
                leftPos--
            }
        }

        for(i in res.indices) {
            println(res[i])
        }
    }
}