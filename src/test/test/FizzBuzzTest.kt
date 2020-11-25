import org.junit.*

class FizzBuzzTest {

    private val fizz = FizzBuzz()

    @Test
    fun oneMustReturnsOne() {

        val result = fizz.transformAnswer(1)
        Assert.assertEquals("1", result)
    }

    @Test
    fun returnsFizzBuzzSpazzWhenNumberIsThirtyFive() {

        val result = fizz.transformAnswer(35)

        Assert.assertEquals("FizzBuzzSpazz", result)
    }


}