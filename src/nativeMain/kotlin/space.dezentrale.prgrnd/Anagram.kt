package space.dezentrale.prgrnd

class Anagram {
    fun isAnagram(s: String, t: String): Boolean {
        val sArray = s.toCharArray()
        sArray.sort()
        val tArray = t.toCharArray()
        tArray.sort()

        return sArray.contentEquals(tArray)
    }
}