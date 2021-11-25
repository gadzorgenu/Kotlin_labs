package lab_1

fun main(args: Array<String>) {
    println("Hello World!")

//    Q2
    var word:String = "Hello"
    println(word)

    //Q3
    for(x in -4..6){
        println( "( $x, ${calculateY(3,x,-1)} )")
    }

//    //Q3
//    for (x in -4..4){
//        println( " ( $x, ${calculateY(3,x,5)} )")
//    }
//        println("Points")
    for(x in 0..20){
        var y1:Int = calculateY(3,x,5)
        var y2:Int = calculateY(4, x, 2)
        if( y1 == y2){
            println( "Point of Intersection: ( $x, ${calculateY(3,x,5)} ), ( $x, ${calculateY(4, x, 2)} )")
        }
    }
    for (x in -4..4){
        println( " ( $x, ${calculateY(3,x,5)} ), ( $x, ${calculateY(4, x, 2)} )")
    }

    intersection(3,5,4,2)
    intersection(2,1,3,3)
    intersection(-2,3,3,-2)

}

fun calculateY(m : Int, x : Int, c : Int) : Int {
    // y = mx + c - formula for a straight line
    return m * x + c
}

fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int) : Unit {

    for(x in 0..100){
        var point1:Int = calculateY(mOne,x,cOne)
        var point2:Int = calculateY(mTwo,x,cTwo)
        if(point1 == point2)
            println("The points intersect at $x")
//        else{
//            println("Don't intersect")
//        }

    }
}