import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Employee_Management {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        
        while(true){
        System.out.println("Enter:\n 1: To create a new Employee File\n 2: To Write to an Existing employee file\n 3: To overwrite an existing employee file\n 4: To read an employee file\n 5: To delete an employee file \n Press 0 to exit");
        int option =scan.nextInt();
        if(option==0) break;
        switch(option){
            case 1:{
                System.out.println("Enter the file name to be created");
                String name=scan.next();
                try{
                File newfile=new File(name);
                if(newfile.createNewFile()){
                    System.out.println("File created");
                }
                else{
        System.out.println("File already exist");
                }
            }
            catch(IOException e){
                System.out.println("An error occurred"+e.getMessage());
            }
            break;
        }
        case 2:{
            System.out.println("Enter file name");
        String fname=scan.next();
        scan.nextLine();
    try{
       
        FileWriter writer=new FileWriter(fname,true);
        System.out.println("Enter the content (Enter /q to exit)");
        String content="";
        while(true){
            String str=scan.next();
            if(str.equals("/q")) break;
         content=content+" "+str;
        }
        scan.nextLine();
        writer.write(content);
        writer.close();
        System.out.println("Successfully wrote to the file");
    }
    catch(IOException e){
        System.out.println("An error occurred"+e.getMessage());
    }
    break;
        }
        case 3:{
            System.out.println("Enter file name");
            String fname=scan.next();
            scan.nextLine();
        try{
           
            FileWriter writer=new FileWriter(fname,false);
            System.out.println("Enter the content");
            String content=scan.nextLine();
            scan.nextLine();
            writer.write(content);
            writer.close();
            System.out.println("Successfully wrote to the file");
        }
        catch(IOException e){
            System.out.println("An error occurred"+e.getMessage());
        }
        break;
        }
        case 4:{
            System.out.println("Enter file name");
            String name=scan.next();
            try{
            File myobj=new File(name);
            Scanner reader=new Scanner(myobj);
            while(reader.hasNextLine()){
                String details=reader.nextLine();
                System.out.println(details);
            }
            reader.close();
            }
            catch(FileNotFoundException e){
                System.out.println("Error opening the file "+e.getMessage());
            }
            break;
        }
        case 5:{
            System.out.println("Enter file name");
            String finame=scan.next();
            File myfile= new File(finame);
            if(myfile.delete()){
                System.out.println("Deleted the file");
            }
            else{
                System.out.println("Failed to delete the file");
            }
            break;
        
        }
         default:
         System.out.println("Enter valid choice");
    }
}
}
}

