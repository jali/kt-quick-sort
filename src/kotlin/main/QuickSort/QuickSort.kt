package QuickSort

import java.util.*

typealias PairOfLists = Pair<List<Int>, List<Int>>

class QuickSort {

    fun partition(list: List<Int>, pivot: Int): PairOfLists {
        fun loop(list: List<Int>, pivot:Int, result: PairOfLists): PairOfLists = when {
            list.isEmpty() -> result
            else ->
                    if(list.first() < pivot) {
                        loop(
                                list.drop(1),
                                pivot,
                                PairOfLists(listOf(list.first()) + result.first, result.second))
                    } else {
                        loop(list.drop(1), pivot, PairOfLists(result.first, listOf(list.first()) + result.second))
                    }
        }
        return loop(list, pivot, PairOfLists(listOf(), listOf()))
    }

    fun randomizeList(n: Int): List<Int> {
        fun randIt(n: Int, res: List<Int>): List<Int> = when {
            n == 0 -> res
            else -> {
                randIt(n-1, listOf(Random().nextInt(1000)) + res)
            }
        }
        return randIt(n, listOf()).toList()
    }
}