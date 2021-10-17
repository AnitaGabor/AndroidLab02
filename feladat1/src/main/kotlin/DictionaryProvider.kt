class DictionaryProvider {
    fun createDictionary(dic: DictionaryType):IDictionary {
        lateinit var dict:IDictionary
        if(dic == DictionaryType.ARRAY_LIST){
            dict = ListDictionary
        }
        if(dic == DictionaryType.TREE_SET){
            dict = TreeSetDictionary
        }
        if(dic == DictionaryType.HASH_SET){
            dict =  HashSetDictionary
        }
        return dict
    }
}