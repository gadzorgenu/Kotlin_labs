package lab_2

class SortedClassroom(vararg sts : Student) : Classroom<Student>(*sts) {

    class StudentSorter : Comparator<Student>{

        override fun compare(student1: Student, student2: Student): Int = when {
            student1.averageGrade()  > student2.averageGrade() -> 1
            student1.averageGrade() <student2.averageGrade() -> -1
             else -> 0

        }
    }

    override fun iterator(): Iterator<Student> {
        return students.sortedWith(StudentSorter()).iterator()
    }
}