import java.util.*

fun Date.leapYear() = when {
    this.year % 4 == 0 -> when {
        year % 100 == 0 -> year % 400 == 0 //szazad fordulo ellenorzes
        else -> true
    }
    else -> false
}

fun Date.valid() = when {
    this.year > 0 -> when (this.month) {
        1, 3, 5, 7, 8, 10, 12 -> this.day in 1..31
        4, 6, 9, 11 -> this.day in 1..30
        2  -> if (this.leapYear()) (this.day in 1..29) else (this.day in 1..28)
        else -> false
    }
    else -> false
}

data class Date(val year:Int = Calendar.YEAR, val month: Int = Calendar.MONTH, val day:Int = Calendar.DAY_OF_MONTH) : Comparable<Date>{
    override fun compareTo(d: Date): Int {
        return compareValuesBy(this,d,Date::year,Date::month,Date::day)
    }

}