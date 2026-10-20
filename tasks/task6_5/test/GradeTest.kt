// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({
    // Write your tests in here
    "A mark below 0 gives a ?" {
        withClue("Mark = -1") { grade(-1) shouldBe "?" }
        withClue("Mark = -10") { grade(-10) shouldBe "?" }
    }

    "A mark between 0 and 39 gives a Fail" {
        withClue("Mark = 0") { grade(0) shouldBe "Fail" }
        withClue("Mark = 23") { grade(23) shouldBe "Fail" }
        withClue("Mark = 39") { grade(39) shouldBe "Fail" }
    }

    "A mark between 40 and 69 gives a Pass" {
        withClue("Mark = 40") { grade(40) shouldBe "Pass" }
        withClue("Mark = 53") { grade(53) shouldBe "Pass" }
        withClue("Mark = 69") { grade(69) shouldBe "Pass" }
    }

    "A mark between 70 and 100 gives a Fail" {
        withClue("Mark = 70") { grade(70) shouldBe "Distinction" }
        withClue("Mark = 83") { grade(83) shouldBe "Distinction" }
        withClue("Mark = 100") { grade(100) shouldBe "Distinction" }
    }

    "A mark above 100 gives a ?" {
        withClue("Mark = 101") { grade(101) shouldBe "?" }
        withClue("Mark = 111") { grade(111) shouldBe "?" }
    }
})
