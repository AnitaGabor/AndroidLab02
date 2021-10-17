fun String.monogram() = this.split(' ').map{it.first()}.joinToString("")

fun List<String>.joinElements(separator: String):String = this.joinToString(separator)

fun List<String>.longestString() = this.maxOf{it}

fun main(args: Array<String>) {
    val name = "Jhony Smith"
    val mono  = name.monogram()
    println("$name -> $mono")

    val fruits = listOf("apple","pear","strawberry","melon")
    print("List joined to string: ")
    val fruitsString = fruits.joinElements("#")
    println(fruitsString)
    print("The longest string: ")
    val longestWord = fruits.longestString()
    println(longestWord)





}