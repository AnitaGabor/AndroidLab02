interface IDictionary {
    fun add(word:String) :Boolean;
    fun find(word:String) :Boolean;
    fun size() :Int;
    companion object {
        const val name:String = "dict.txt"
    }
}