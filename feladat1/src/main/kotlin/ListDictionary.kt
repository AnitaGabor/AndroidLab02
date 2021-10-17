import java.io.File

object  ListDictionary : IDictionary {
    val words  = mutableListOf<String>()
    init {

        File(IDictionary.name).forEachLine { this.add(it) }
    }
    override fun add(word: String): Boolean {
        if(word != ""){
            words.add(word)
            return true
        }
        return false
    }

    override fun find(word: String): Boolean {
        val isInDictionary = words.find{it == word}
        if(isInDictionary != null){
            return true
        }
        return false
    }

    override fun size(): Int {
        return words.size
    }
}