import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Employee_mgmt2 {
    public static void main(String[]args) throws IOException{
        Scanner scan=new Scanner(System.in);
        while(true){
        System.out.println("Enter: \n 1: To add an employee details \n 2: To display an employee details \n 3: To update an employee details \n 4: To delete an employee details \n Enter 0 to exit");
        int option=scan.nextInt();
        switch(option){
        case 1:{
    System.out.println("Enter the employee id");
    int id=scan.nextInt();
    System.out.println("Enter employee name");
    scan.nextLine();
    String name=scan.nextLine();
    
    System.out.println("Enter Employee age");
    int age=scan.nextInt();
    System.out.println("Enter Employee salary");
    double salary=scan.nextDouble();
    try{
    FileWriter writer=new FileWriter("Employee_data.txt",true);
    String content="Id = "+id+" "+"Name = "+name+" "+"Age = "+age+" "+"Salary = "+salary+"\n";
    writer.write(content);
    writer.close();
    }
    catch(IOException e){
        System.out.println("An error occurred"+e.getMessage());
    }
    break;
}
case 2:{

   
    File file=new File("Employee_data.txt");
    Scanner reader=new Scanner(file);
    System.out.println("Enter employee id");
    
    String em_id=scan.next();
    
    while(reader.hasNextLine()){
        String emp_details=reader.nextLine();
        String[]arr=emp_details.split(" ");
        if(arr[2].equals(em_id)){
            System.out.println(emp_details);
            break;
        }
 }
 break;
}
case 3:{
   
                System.out.println("Enter employee id to update data");
                String emp_id=scan.next();
               
                System.out.println("Enter name");
                scan.nextLine();
                String name_a=scan.nextLine();
                System.out.println("Enter Employee age");
                int age_a=scan.nextInt();
                System.out.println("Enter Employee salary");
                double salary_a=scan.nextDouble();

                File upd_file=new File("Employee_data.txt");
                Scanner reader_a= new Scanner(upd_file);
                String content="";
                boolean check=false;
                while(reader_a.hasNextLine()){
                    String details_a=reader_a.nextLine();
                    if(check==false){
                       
                        String[]brr=details_a.split(" ");
                        if(brr[2].equals(emp_id)){
                         content=content+"\n"+"Id = "+emp_id+" "+"Name = "+name_a+" "+"Age = "+age_a+" "+"Salary = "+salary_a;
                         check=true;
                        }
                   
                    }
                    else{
                        if(content.equals(" ")){
                            content+=details_a;
                        }
                        else
                        content=content+"\n"+details_a;
                    }
                }
                FileWriter writer_a=new FileWriter("Employee_data.txt",false);
                writer_a.write(content);
                writer_a.close();
                break;
            }

       case 4:{
        System.out.println("Enter employee id to update data");
        String emp_id_d=scan.next();
        File upd_file_d=new File("Employee_data.txt");
        Scanner reader_d= new Scanner(upd_file_d);
        String content_d="";
        boolean check_d=false;
        while(reader_d.hasNextLine()){
            String details_a=reader_d.nextLine();
            if(check_d==false){
               
                String[]brr=details_a.split(" ");
                if(brr[2].equals(emp_id_d)){
                 
                 check_d=true;
                }
           
            }
            else{
                if(content_d.equals(" ")){
                    content_d+=details_a;
                }
                else
                content_d=content_d+"\n"+details_a;
            }
        }
        FileWriter writer_d=new FileWriter("Employee_data.txt",false);
        writer_d.write(content_d);
        writer_d.close();
      break;
        }
        case 5:
        System.exit(0);
    }
}
    }
}
