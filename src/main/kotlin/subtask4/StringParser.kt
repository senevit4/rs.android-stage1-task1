package subtask4

class StringParser {
    private val OPENING_BRACKET = '('
    private val CLOSING_BRACKET = ')'
    private val OPENING_BRACKET_SQUARE = '['
    private val CLOSING_BRACKET_SQUARE = ']'
    private val OPENING_BRACKET_TRIANGLE = '<'
    private val CLOSING_BRACKET_TRIANGLE = '>'

    fun getResult(inputString: String): Array<String> {
        val result =mutableListOf<String>()
        val symbols = inputString.toCharArray()
        for (i in symbols.indices){
            when (symbols[i]) {
                OPENING_BRACKET -> {
                    result.add(getCorrectSubString(inputString.substring(i), OPENING_BRACKET, CLOSING_BRACKET))
                }
                OPENING_BRACKET_SQUARE -> {
                    result.add(getCorrectSubString(inputString.substring(i), OPENING_BRACKET_SQUARE, CLOSING_BRACKET_SQUARE))
                }
                OPENING_BRACKET_TRIANGLE -> {
                    result.add(getCorrectSubString(inputString.substring(i), OPENING_BRACKET_TRIANGLE, CLOSING_BRACKET_TRIANGLE))
                }
            }
        }

        return result.toTypedArray()
    }

   private fun getCorrectSubString(inputString: String, openingBracket:Char, closingBracket: Char): String{
        val symbols = inputString.toCharArray()
        var result = ""
        var indicator = 0
        for (i in symbols.indices){
            if (symbols[i] == openingBracket) {
                indicator++
            }
            if (symbols[i] == closingBracket && indicator!=0) {
                indicator--
            }
            if (symbols[i] == closingBracket && indicator==0) {
                result = inputString.substring(1, i)
                break
            }

        }
        return result
    }
}
