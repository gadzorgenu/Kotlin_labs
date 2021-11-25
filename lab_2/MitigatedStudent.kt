package lab_2

class MitigatedStudent(override val name: String,override val grades: MutableList<Double> ) : Student(name, grades) {
    override fun averageGrade(): Double {
        println("Student grades $grades")
        grades.remove(grades.minOf { s -> s })
        println("Final grades without lowest $grades")
        return grades.reduce { a, b -> a + b } /grades.size
    }

}