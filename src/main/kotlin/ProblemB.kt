class ProblemB {

    fun main() {

        val t = readInt();
        val arr = ArrayList<StringBuilder>()
        for (i in 1..t){
            val (n, k) = readIntArray(2)
            var str = StringBuilder()

            for (j in 1..n)
                str.append(('a' + j % k).toChar())
            arr.add(str)
        }
        arr.forEach{println(it)}
    }

}
