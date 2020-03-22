package subtask3

class BillCounter {

    private val fairlySplit = "Bon Appetit"

    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val fairPay = (bill.sum() - bill[k])/2
        return if(fairPay == b) fairlySplit else (b - fairPay).toString()
    }
}
