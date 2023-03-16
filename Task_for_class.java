

/**
 *
 * @author ASUS
 */
class Student{
    int rollNumber,marks1,marks2,marks3,total;
    float avg;
    String name,course,grade;
    public Student(int roll,String name,String course,int marks1,int marks2,int marks3){
        this.course=course;
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
        this.name=name;
        this.rollNumber=roll;
        }
    public void calculateTotal(){
        total=marks1+marks2+marks3;
       // System.out.println("total marks are "+total);
    }
    public void calculateAvg(){
        avg=(marks1+marks2+marks3)/3;
       // System.out.println("Average of marks are "+avg);
    }
    public void calculateGrade(){
        int avg=(int)(marks1+marks2+marks3)/3;
        if(avg>=90) grade="A";
        if(avg>=80&&avg<90) grade="B";
        if(avg>=70&&avg<80) grade="C";
        if(avg>=60&&avg<70) grade="D";
        if(avg>=50&&avg<60) grade="E";
        if(avg>=0&&avg<50) grade="Fail";
    }
    public int getTotal(){
        return total;
    }
    public float getAvg(){
        return avg;
    }
    public String getGrade(){
        return grade;
    }
    public String toString(){
        calculateTotal();
        calculateAvg();
        calculateGrade();
        return rollNumber+" "+name+" "+course+" "+total+" "+avg+" "+grade;
    }
}
 class StudentTest {
    public static void main(String[]args){
        Student stud1=new Student(101,"Rashi","MCA",90,96,95);
        Student stud2=new Student(102,"Pooja","MCA",90,87,76);
        Student stud3=new Student(103,"Pari","MCA",90,76,98);
        Student stud4=new Student(104,"Aditi","MCA",89,90,87);
        Student stud5=new Student(105,"Nikansha","MCA",89,90,76);
        System.out.println(stud1);
        System.out.println(stud2);
        System.out.println(stud3);
        System.out.println(stud4);
        System.out.println(stud5);
        
    }
}
