class Words {
    fun reverse(word:String) :String = when(word){
        ""->""
        else -> reverse(word.slice(1..word.length-1)) + word[0]
    }

    fun firstIsVowel(word: String) :Boolean =
        if(word.length == 0) false else
            when(word[0]){
                'a','e','i','o','u' -> true
                else -> false
            }
}