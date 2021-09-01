class ProblemA {

    fun main() {

        //ваша реализация в методе main

        var t = readInt();
        var i = 0
        var arr = LongArray(t)
        while (i < t) {
            val (a, b, k) = readLine()!!.split(' ').map(String::toInt)
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
