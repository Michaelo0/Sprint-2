class ProblemC {

    fun main() {

        //ваша реализация в методе main
        val n = readInt()

        val list = ArrayList<Int>(readLine()!!.split(' ').map(String::toInt))

        list.sort()
        var sum = 0
        for (i in 1 until list.size step 2){
            sum += list[i] - list[i - 1]
        }
        println(sum)
    }

}
