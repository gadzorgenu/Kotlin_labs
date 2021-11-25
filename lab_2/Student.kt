package lab_2

open class Student( open val name : String,open val grades : List<Double>) {
     open fun averageGrade() : Double {
        return grades.reduce { a, b -> a + b } /grades.size
    }
}