package space.dezentrale.prgrnd

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class AnagramTest {
    @Test
    fun `'anagram' is an anagram of 'nagaram'`() {
        val anagram = Anagram()

        assertTrue { anagram.isAnagram("anagram", "nagaram") }
    }

    @Test
    fun `'rat' is not an anagram of 'car'`() {
        val anagram = Anagram()

        assertFalse { anagram.isAnagram("rat", "car") }
    }
}