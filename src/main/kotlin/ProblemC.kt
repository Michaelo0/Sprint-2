class ProblemC {

    fun main() {

        val n = readInt()

        val list = readIntArray(n)

        list.sort()
        var sum = 0
        for (i in 1 until list.size step 2){
            sum += list[i] - list[i - 1]
        }
        println(sum)
    }

}
