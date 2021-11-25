import lab_2.*
import lab_1.SimpleAgent
import kotlin.random.Random as krnd
import java.util.Random as jrnd

fun main() {

    var agent = SimpleAgent("Okai")
    println(agent)








//    val env = FoodEnvironment(SimpleAgent("Philip"))
//    env.step()
//    println(env.scores)

//    var env = FoodEnvironment()
//    for(i in 1..10){
//        env.step()
//        println(env.animal)
//    }

//     var classroom = Classroom(
//         Student("Gina", listOf(20.0,50.0,20.0)),
//         Student("Gii", listOf(60.0,90.0,50.0)),
//         Student("Gyyy", listOf(30.0,70.0,70.0))
//     )
//
//     var classroom1 = Classroom(
//         Student("Gina", listOf(20.0,50.0,20.0)),
//         Student("Gii", listOf(70.0,10.0,70.0)),
//         Student("", listOf(60.0,90.0,60.0)),
//     )
//    var sortedStudents = SortedClassroom(
//        Student("Gina", listOf(20.0,58.0,28.0)),
//        Student("Gina", listOf(20.0,18.0,28.0)),
//        Student("Okai", listOf(90.0,100.0,100.0)),
//    )
//    var stud = MitigatedStudent("Giiiii", mutableListOf(20.0,58.0,28.0))
//    println("stud: ${stud.averageGrade()}")

//    classroom.addBetter(sortedStudents)
//    for (s : Student in classroom){
//        println("Student ${s.name} with grade ${s.averageGrade()}")
//    }

    val gradeBook : List<Grade> = listOf(
        Grade("A-132", "maths", null),
        Grade("E-543","maths", 42.3),
        Grade("A-132", "cs", 55.0),
        Grade("I-999", "maths", 87.65),
        Grade("O-765", "maths", null),
        Grade("U-951", "cs", 44.23),
        Grade("O-765", "cs", 58.5)
    )

    val names : List<NameMapping> = listOf(
        NameMapping("A-132", "Alice"),
        NameMapping("E-543", null),
        NameMapping("I-999", "Charlie"),
        NameMapping("O-765", null),
        NameMapping("U-951", "Eve")
    )

   showNames(gradeBook,names)
   var num = factorial(4)
    println(num)

    val exp1 = { i  : Int -> i*2}

    val exp2 = { i  : Int -> i/2}

    val compositionFunc = { i: Int -> exp1(exp2(i))}
    println(compositionFunc(6))


    //Randoms
    var rand1 =0
    var rand2 = 0

    for(x in 1..1000){
        if(jrnd().nextInt() < krnd.nextInt()){
            rand2++
        }else{
            rand1++
        }
    }
    println("Java random:  $rand1")
    println("Java random:  $rand2")

    println(totalLength(listOf("Hello", "World", "How", "Are", "You")))

}
//Q2
fun showGrades(grades:List<Grade>, subject:String) : Double{
    var notNullGrades =  grades.filter { it.score != null && it.subject == subject}.map { grade -> grade.score!!  }
    return notNullGrades.reduce { a, b -> a + b } / notNullGrades.size
}

fun calculateAverageById(grades:List<Grade>, id:String) : Double{
    var notNullGrades =  grades.filter { it.score != null && it.ID == id}.map { grade -> grade.score!!  }
    return notNullGrades.reduce { a, b -> a + b } / notNullGrades.size
}

fun showNames(grades: List<Grade>, names:List<NameMapping>) {
    names.forEach { name -> println("Id: ${name.ID} , name: ${name.name} , averageGrade: ${calculateAverageById(grades, name.ID)}") }

}

tailrec fun factorial(n: Int) :Int = if( n <0) 0 else when(n) {
    0,1 -> 1
    else -> factorial(n-1) * n
}

fun totalLength(strings: List<String>) :Int = strings.map { s -> s.length }.reduce{a, b -> a+b}

//fun printString(string:List<String>): String{
//    string.
//}