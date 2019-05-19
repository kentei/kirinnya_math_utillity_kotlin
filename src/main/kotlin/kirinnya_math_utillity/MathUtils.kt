package kirinnya_math_utillity

class MathUtils {
    companion object {
        /**
         * Return a list of divisors.
         * @param[num] The number for which you want to find the divisor.
         * @param[orderType] Specify sort order.
         * @return a list of divisors.
         * @author Kentei_Syunrai
         * @since 1.0
         */
        @JvmStatic
        fun getDivisorList(num:Long, orderType: SortOrderType):ArrayList<Long>{
            val list: ArrayList<Long> = ArrayList<Long>()
            var i:Long = 1
            while(i * i <= num){
                if (num % i == 0L) {
                    list.add(i)
                    if(i != num / i){
                        list.add(num/i)
                    }
                }
                i++
            }
            when(orderType){
                SortOrderType.ASCENDING -> {
                    list.sortWith(Comparator { a,b ->  a.compareTo(b)})
                }
                SortOrderType.DESCENDING -> {
                    list.sortWith(Comparator { a,b ->  b.compareTo(a)})
                }
                else -> {
                    //don't sort
                }
            }
            return list;
        }
    }
}

/**
 * For operation verification.
 * @author Kentei_Syunrai
 * @since 1.0
 */
fun main(args: Array<String>) {
    val start:Long = System.currentTimeMillis()
    for(i in MathUtils.getDivisorList(1000000000000, SortOrderType.ASCENDING)){
        println(i)
    }
    val end:Long = System.currentTimeMillis()
    print("${end - start}ms")
}