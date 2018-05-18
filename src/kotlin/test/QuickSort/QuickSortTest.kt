package QuickSort

import org.junit.Test
import kotlin.test.assertTrue

class QuickSortTest {

    @Test
    fun partitionShouldReturnPairOfListsOfIntegerTest() {
        val list: List<Int> = listOf(23,53,11,54,12,55,19,32,56,99)
        val pivot: Int = 12
        val quickSort = QuickSort()
        val actual = quickSort.partition(list, pivot)
        assertTrue(actual is Pair<List<Int>, List<Int>>, "Expected return pair of lists of integer")
    }
}