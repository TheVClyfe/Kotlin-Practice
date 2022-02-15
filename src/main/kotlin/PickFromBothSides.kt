class PickFromBothSides {

    //given a situation where you need to pick "b" objects from either end of the array, find the max value you can get overall as a sum
    //you can only pick from left or right end at any point
    fun code() {
        val input = arrayOf(5, -2, 3, 1, 2) //input array
        val b = 3 //constraint, how many items need to be picked up
        var mx = 0 //result, init to 0

        val leftArr = input.copyOf()
        val rightArr = input.copyOf()

        for(i in 1 until input.size) {
            leftArr[i] = leftArr[i-1]+leftArr[i]
        }

        for(i in input.size - 2 downTo 0 ) {
            rightArr[i] = rightArr[i] + rightArr[i+1]
        }

        println("Left arr: ")
        for(i in input.indices) {
            print(leftArr[i])
            print(" ")
        }

        println()
        println("Right arr: ")
        for(i in input.indices) {
            print(rightArr[i])
            print(" ")
        }
        //i-1 = 0, 5-(3-i)
        //0  1 2 3 4
        //5 -2 3 1 2

        println()
        for(i in 0..b) {
            val left: Int = if(i>0) leftArr[i-1] else 0
            val right: Int = if(i==b) 0 else rightArr[rightArr.size - (b-i)]
            println("For left pick " + i + " and right pick " + (rightArr.size - (b-i)))
            println((left+right))
            mx = Integer.max(mx, left + right)
        }

        println("Max value is $mx")
    }
}