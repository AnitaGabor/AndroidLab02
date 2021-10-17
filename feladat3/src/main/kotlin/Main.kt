import kotlin.random.Random

fun main(args: Array<String>) {

    val listOfValidDates = mutableListOf<Date>()
    var counter: Int = 0
    print("Invalid dates: ")
    while(counter != 10){
        val year = Random.nextInt(1950,2050)
        val month = Random.nextInt(15 + 5) - 5
        val day = Random.nextInt(40 + 5 ) - 5
        //println("$year $month $day")
        val date = Date(year,month,day)
        if(date.valid()){
            listOfValidDates.add(date)
        }
        else{
            println(date)
        }
        counter ++;
    }
    println()
    print("Valid dates: ")
    listOfValidDates.forEach{println(it)}
    println()
    print("Natural ordering: ")
    listOfValidDates.sort()
    listOfValidDates.forEach{println(it)}
    println()
    print("Reverse: ")
    listOfValidDates.reverse()
    listOfValidDates.forEach{println(it)}
    println()
    print("Custom ordering: ")
    val compare = {d1 :Date, d2 :Date -> compareValues(d1,d2)}
    listOfValidDates.sortWith(compare)
    listOfValidDates.forEach{println(it)}


}