class PositiveInts(num:Int) {
    var number:Int = 0
    //if value that is is set to is less than 0, set 0 else set valuE
        //CREATING A SETTER to change the behaviour of the variable
    set(value) { field = if(value < 0) 0 else value}

    init{
        number = num
    }
}