class FizzBuzz {

    fun transformAnswer(number: Int) : String {
        var answer = ""

        answer = answer + isMultipleOfOrContainsThree(number) + isMultipleOfOrContainsFive(number) + isMultipleOfSeven(number)

        if(answer == "") return number.toString() else return answer
    }

    fun isMultipleOfOrContainsThree(number: Int) : String {
        return if(isMultipleOf(number, 3) || containsThree(number)) "Fizz" else ""
    }

    fun isMultipleOfOrContainsFive(number: Int) : String {
        return if(isMultipleOf(number, 5) || containsFive(number)) "Buzz" else ""
    }

    fun isMultipleOfSeven(number : Int) : String {
        return if(isMultipleOf(number, 7)) "Spazz" else ""
    }

    fun containsThree(number: Int) : Boolean {
        return number.toString().contains("3")
    }

    fun containsFive(number: Int) : Boolean {
        return number.toString().contains("5")
    }

    fun isMultipleOf(number: Int, multipleOf: Int) : Boolean {
        return number%multipleOf==0;
    }
}

fun main() {
    val fizz = FizzBuzz()
    for (i in 1..100) {
        println("$i: ${fizz.transformAnswer(i)}")
    }
}
