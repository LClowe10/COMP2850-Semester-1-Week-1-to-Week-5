// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here

    // Test that on a list of size 1, it should return the only value
    "A List of size 1 should give only value" {
        median(listOf(1.0f)) shouldBe (1.0f plusOrMinus 1e-6f)
    }

    // Test that on a list of size 2, it should compute the average of the two numbers
    "A List of size 2 should give value between" {
        median(listOf(1.0f, 2.5f)) shouldBe (1.75f plusOrMinus 1e-6f) 
    }

    // Test that on a list of size 3, it should give the middle value when sorted
    "A List of size 3 should give value in middle when sorted" {
        median(listOf(2.0f, 1.0f, 3.0f)) shouldBe (2.0f plusOrMinus 1e-6f)
    }

    // Test that on a list of size 4, it should compute the average of the two numbers in the middle when sorted
    "A List of size 4 should give value between" {
        median(listOf(2.0f, 1.0f, 4.0f, 3.0f)) shouldBe (2.5f plusOrMinus 1e-6f)
    }
})
