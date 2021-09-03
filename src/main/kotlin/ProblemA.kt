class ProblemA {

    fun main() {

        val t = readInt();
        var i = 0
        val arr = LongArray(t)
        while (i < t) {
            val (a, b, k) = readIntArray(3)
            arr[i++] = coordinate(a, b, k)
        }

        i = 0
        while (i < arr.size){
            println(arr[i++])
        }

    }

    fun coordinate(a : Int, b : Int, k : Int) : Long {
        var i = 0
        var res : Long = 0
        while (i < k){
            if (i % 2 == 0)
                res += a
            else
                res -= b
            i++
        }
        return res
    }

}
