import java.io.File
import java.util.*

object TreeSetDictionary : IDictionary{
    val words = TreeSet<String>();
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
        if(words.contains(word)){
            return true;
        }
        return false;
    }

    override fun size(): Int {
        return words.size;
    }

}