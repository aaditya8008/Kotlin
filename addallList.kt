fun main() {
    val nums = mutableListOf(1, 2, 3) // mutable list
    println(nums.indexOf(3)) // index returned
    println(nums.contains(7)) // contained or not
    nums[1] = 2 
    val nums2 = mutableListOf(1, 2, 3) // mutable list
    println(nums2.indexOf(3)) // index returned
    println(nums2.contains(7)) // contained or not
    nums2[1] = 2 // can be changed
    nums2.add(5)
    println(nums2)
    nums2.remove(2)
    println(nums2)
    nums.addAll(nums2)
    println(nums)
}