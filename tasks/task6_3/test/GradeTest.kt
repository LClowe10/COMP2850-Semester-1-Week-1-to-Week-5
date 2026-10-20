// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Write tests here
    @Test
    fun `Mark of -1 gives a ?`() {
        assertEquals("?", grade(-1))
    }

    @Test
    fun `Mark of 0 gives a Fail`() {
        assertEquals("Fail", grade(0))
    }

    @Test
    fun `Mark of 25 gives a Pass`() {
        assertEquals("Fail", grade(25))
    }

    @Test
    fun `Mark of 39 gives a Pass`() {
        assertEquals("Fail", grade(39))
    }

    @Test
    fun `Mark of 40 gives a Pass`() {
        assertEquals("Pass", grade(40))
    }

    @Test
    fun `Mark of 55 gives a Pass`() {
        assertEquals("Pass", grade(55))
    }

    @Test
    fun `Mark of 70 gives a Pass`() {
        assertEquals("Pass", grade(70))
    }

    @Test
    fun `Mark of 71 gives a Distinction`() {
        assertEquals("Distinction", grade(71))
    }

    @Test
    fun `Mark of 82 gives a Distinction`() {
        assertEquals("Distinction", grade(82))
    }

    @Test
    fun `Mark of 100 gives a Distinction`() {
        assertEquals("Distinction", grade(100))
    }

    @Test
    fun `Mark of 101 gives a ?`() {
        assertEquals("?", grade(101))
    }
}
