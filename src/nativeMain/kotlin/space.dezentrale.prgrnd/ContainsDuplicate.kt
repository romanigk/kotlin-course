package space.dezentrale.prgrnd
fun containsDuplicate(nums: IntArray): Boolean {
    val unicates: MutableSet<Int> = mutableSetOf()
    nums.forEach {
        if (unicates.contains(it)) {
            return true
        } else {
            unicates.add(it)
        }
    }
    return false
}