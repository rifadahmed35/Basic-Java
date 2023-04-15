class Student1{

    static int count = 0;
    Student1(){
        count++;
    }
    void totalStudent(){
        System.out.println("Total No of Student : "+count);
    }
}

public class Static_Variable_total_student_number {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.totalStudent();
        Student1 student2 = new Student1();
        student2.totalStudent();
        Student1 student3 = new Student1();
        student3.totalStudent();
        Student1 student4 = new Student1();
        student4.totalStudent();
        Student1 student5 = new Student1();
        student5.totalStudent();

    }
}
