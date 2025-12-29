public class TestStudent {
    public static void main(String[] args) {

        Student stu1 = new Student("Dua Lipa", "Los Angeles");
        System.out.println("STUDENT INFORMATION: ");
        System.out.println(stu1.toString());
        System.out.println();

        System.out.println("STUDENT INFORMATION: ");
        stu1.setAddress("Vegas");
        System.out.println(stu1.toString());
        System.out.println();

        System.out.println(stu1.getName());
        System.out.println(stu1.getAddress());
        System.out.println();

        stu1.addCourseGrade("SENG211", 70);
        stu1.addCourseGrade("COME201", 43);
        stu1.addCourseGrade("COME205", 88);

        stu1.printGrades();
        System.out.print("The average grade is " + stu1.getAverageGrade());
    }
}
