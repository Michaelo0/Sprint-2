class ProblemC {

    fun main() {

        //ваша реализация в методе main
        var n = readInt()

        var list = ArrayList<Int>(readLine()!!.split(' ').map(String::toInt))

        list.sort()
        var sum = 0
        for (i in 1 .. (list.size - 1) step 2){
            sum += list.get(i) - list.get(i - 1)
        }
        println(sum)
    }

}
