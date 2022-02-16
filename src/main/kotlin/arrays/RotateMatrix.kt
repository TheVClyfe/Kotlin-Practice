package arrays

import DSAPractice

/**
 *
 *
    You are given an n x n 2D matrix representing an image.

    Rotate the image by 90 degrees (clockwise).

    You need to do this in place.

    Note that if you end up using an additional array, you will only receive partial score.

    Example:

    If the array is

    [
    [1, 2],
    [3, 4]
    ]
    Then the rotated array becomes:

    [
    [3, 1],
    [4, 2]
    ]
 *
 *
 */

class RotateMatrix: DSAPractice {

    override fun code() {
        val mat = listOf(mutableListOf(1,2,3), mutableListOf(4,5,6), mutableListOf(7,8,9))

        //00 01
        //10 11
        for(i in mat.indices) {
            for(j in mat[i].indices) {
                if(i>j) {
                    val t = mat[i][j]
                    mat[i][j] = mat[j][i]
                    mat[j][i] = t
                }
            }
        }

        for(i in mat.indices) {
            mat[i].reverse()
        }

        print(mat)
    }
}