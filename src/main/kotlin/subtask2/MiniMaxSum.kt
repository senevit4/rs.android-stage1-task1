package subtask2

class MiniMaxSum {

    // TODO: Add general implementation without methods from the box
    fun getResult(input: IntArray): IntArray {
        val sum = input.sum()
        val min = input.min()
        val max = input.max()
        return intArrayOf(sum - max!!, sum - min!!)
    }
}
