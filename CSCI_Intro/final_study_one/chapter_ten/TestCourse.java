public class TestCourse {
    public static void main(String[] args){
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");
        Course course3 = new Course("Alogrithms");

        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");
        course2.addStudent("Kim Smith");

        course3.addStudent("Peter Jones");
        course3.addStudent("Steve Smith");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
    }

    public class Course{
        private String courseName;
        private String[] students = new String[100];
        private int numberOfStudents;

        public Course(String courseName){
            this.courseName = courseName;
        }

        public void addStudent(String student){
            students[numberOfStudents] = student;
            numberOfStudents++;
        }

        public String[] getStudents(){
            return students;
        }

        public int getNumberOfStudents(){
            return numberOfStudents;
        }

        public String getCourseName(){
            return courseName;
        }

        public void dropStudents(String student){

        }
    }
}
