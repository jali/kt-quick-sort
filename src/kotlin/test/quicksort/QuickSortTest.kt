package quicksort

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class QuickSortTest {

    @Test
    fun partitionShouldReturnPairOfListsOfIntegerTest() {
        val list: List<Int> = listOf(23,53,11,54,12,55,19,32,56,99)
        val pivot = 12
        val quickSort = QuickSort()
        val actual = quickSort.partition(list, pivot)
        assertTrue(actual is Pair<List<Int>, List<Int>>, "Expected return pair of lists of integer")
    }

    @Test
    fun createRandomListOfTenIntegerTest() {
        val q = QuickSort()
        val actual = q.randomizeList(10)
        assertTrue(actual.size == 10, "Expected randomized list of 10 integers")
    }

    @Test
    fun sortedTest() {
        val list: List<Int> = listOf(23,53,11,54,12,55,19,32,56,99)
        val pivot: Int = 12
        val quickSort = QuickSort()
        val expected = listOf(11, 12, 19, 23, 32, 53, 54, 55, 56, 99)
        val actual = quickSort.quickSort(list)
        assertEquals(actual, expected, "Expected sorted list")
    }
}