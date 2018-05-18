package QuickSort

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
}