package arrays

import DSAPractice

/**
 *
 *
 *  Problem Description

    Given an integer array A of size N.

    You need to check that whether there exist a element which is strictly greater than all the elements on left of it and strictly smaller than all the elements on right of it.

    If it exists return 1 else return 0.

    NOTE:

    Do not consider the corner elements i.e A[0] and A[N-1] as the answer.


    Problem Constraints
    3 <= N <= 105

    1 <= A\[i] <= 109



    Input Format
    First and only argument is an integer array A containing N integers.



    Output Format
    Return 1 if there exist a element that is strictly greater than all the elements on left of it and strictly smaller than all the elements on right of it else return 0.
 *
 *
 *
 */

class PerfectPeakArray: DSAPractice {
    override fun code() {
        val inputArr = listOf(5, 1, 4, 3, 6, 8, 10, 7, 9)
        //these two arrays will hold the largest values to the right of current element and to the left of current element respectively
        val right: MutableList<Int> = inputArr.toMutableList()
        val left: MutableList<Int> = inputArr.toMutableList()
        right.fill(-1)
        left.fill(-1)

        for(i in inputArr.size-2 downTo 0) {
            right[i] = if(right[i+1]>inputArr[i+1]) right[i+1] else inputArr[i+1]
        }

        for(i in 1 until inputArr.size) {
            left[i] = if(left[i-1]>inputArr[i-1]) left[i-1] else inputArr[i-1]
        }
        left[0] = inputArr[0]
        right[inputArr.size-1] = inputArr[inputArr.size-1]

        var peakExists = false
        for(i in inputArr.indices) {
            if(inputArr[i]>left[i] && inputArr[i]>right[i]) {
                println("True for index $i")
                peakExists = true
                break
            }
        }
        println(left)
        println(right)
        println("Peak existence: $peakExists")
    }
}