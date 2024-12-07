/*Дан массив целых чисел nums. Вернуть значение true, если какое-либо значение встречается в массиве хотя бы дважды.
И вернуть false, если каждый элемент различен*/

import kotlin.system.measureTimeMillis
fun hasDuplicate(nums: IntArray): Boolean {
    val seen = mutableSetOf<Int>()
    for (num in nums) {
        if (seen.contains(num)) {
            return true
        }
        seen.add(num)
    }
    return false
}

fun readInt(): IntArray {
    return readLine()?.split(Regex("[,\\s]+"))?.map { it.toInt() }?.toIntArray() ?: intArrayOf()
}

fun main() {
    print("| Массив: ")
    val nums = readInt()
    testHasDuplicate(nums)
}

fun testHasDuplicate(nums: IntArray) {
    val startTime = System.currentTimeMillis()
    val result = hasDuplicate(nums)
    val endTime = System.currentTimeMillis()
    val time = endTime - startTime
    println("Вывод: $result, Время: $time мс")

    val explanation = if (result) {
        "В массиве есть дубликаты"
    } else {
        "Все элементы различны"
    }

    println("Пояснение: $explanation")
}