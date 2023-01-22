package space.dezentrale.prgrnd

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ContainsDuplicateTest {
    @Test
    fun `it returns true for '1_2_3_1'`() {
        assertTrue(containsDuplicate(intArrayOf(1, 2, 3, 1)))
    }

    @Test
    fun `it returns false for '1_2_3_4'`() {
        assertFalse(containsDuplicate(intArrayOf(1, 2, 3, 4)))
    }

    @Test
    fun `it returns true for '1_1_1_3_3_4_3_2_4_2'`() {
        assertTrue(containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2)))
    }
}