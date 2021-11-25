package lab_2

open class Classroom<T : Student>(vararg sts : T) : Iterable<T> {
    val students : MutableList<T> = mutableListOf()
    init {
        for (s in sts) students.add(s)
    }

    override fun iterator(): Iterator<T> {
        return students.iterator()
    }


    fun addBetter(classroom :Classroom<T>){
//        var highestGrades = students.sortedWith(compareBy {student ->student.averageGrade()}).last()
        val highestGrades = students.sortedWith(compareBy {it.averageGrade()}).last()
        val newestHighestGrade = classroom.filter{ it.averageGrade() >highestGrades.averageGrade()}.toMutableList()
        newestHighestGrade.forEach{students.add(it)}


//        println("Grades ${highestGrades.name} ${highestGrades.averageGrade()}")
//        println("Grades ${newestHighestGrade.}")
    }
}