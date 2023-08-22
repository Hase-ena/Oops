public class Student
{
    int id;
    String name;
    Student(){
    System.out.println("this is a default constructor");
    }
    Student(int i,String n){
        id=i;
        name=n;
    }
    public static void main(String[]args){
        Student s=new Student();
        System.out.println("\n Default constructor values:\n");
        System.out.println("Student id:"+s.id + "\nStudent name:"+s.name);

        System.out.println("\nParameterized constructor values:\n");
        Student student= new Student(10,"David");
        System.out.println("Student id:"+student.id + "\n Student Name:" + student.name);
    }
}