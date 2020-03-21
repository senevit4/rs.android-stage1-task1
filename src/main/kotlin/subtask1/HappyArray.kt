package subtask1

class HappyArray {

    // TODO: Improve the solution
    fun convertToHappy(sadArray: IntArray): IntArray {
        val initialArray = sadArray.toMutableList()
        while (true) {
            var initialSize = initialArray.size
            var initialRange = initialSize-1
            for (i in 1 .. initialRange) {
                if(i >= initialRange){
                    break
                }
                if (initialArray[i] > initialArray[i - 1] + initialArray[i + 1]) {
                    initialArray.removeAt(i)
                    initialRange--
                }
            }
            if (initialArray.size == initialSize){
                break
            }
        }
        return initialArray.toIntArray()
    }
}
