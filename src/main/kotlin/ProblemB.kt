class ProblemB {

    fun main() {

        //ваша реализация в методе main
        var t = readInt();
        var arr = ArrayList<StringBuilder>()
        for (i in 1..t){
            val (n, k) = readLine()!!.split(' ').map(String::toInt)
            var str = StringBuilder()

            for (j in 1..n)
                str.append(('a' + j % k).toChar())
            arr.add(str)
        }
        arr.forEach{println(it)}
    }

}
