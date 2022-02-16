package arrays

class RotateMatrix {

    fun code() {
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