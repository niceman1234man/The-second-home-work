import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student stud =new Student("Yihunie Tarekegn",2, new int[]{97, 80, 76});
        Teacher teach=new Teacher("Habtamu","oop");

        College college=new College("CS",new ArrayList<Student>(),new ArrayList<Teacher>());
college.getStudents().add(stud);
college.getTeachers().add(teach);

System.out.println("s_name :"+stud.getName()+ ", "+"s_id :"+stud.getId()+" ,"+"grades ="+ Arrays.toString(stud.getGrades()));
        System.out.println("The teacher's name : "+teach.getName()+" subject :"+teach.getSubject());
        System.out.println("college :"+college.getName());
        System.out.println("student name :"+college.getStudents().get(0).getName());
        System.out.println("student ID :"+college.getStudents().get(0).getId());
        System.out.println("student grade :"+Arrays.toString(college.getStudents().get(0).getGrades()));
        System.out.println("teacher name :"+college.getTeachers().get(0).getName());
        System.out.println("subject:"+college.getTeachers().get(0).getSubject());







    }
        }