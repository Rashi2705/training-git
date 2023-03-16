import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Read_Write {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
System.out.println("Enter 1 for Creating the file \n Enter 2 for Writing to the file \n Enter 3 to read the file \n Enter 4 to delete the file");
int option=s.nextInt();
switch(option){
    case 1:{
        System.out.println("Enter file name");
        String filename=s.next();
        try{
        File myfile=new File(filename);
        if(myfile.createNewFile()){
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
        String fname=s.next();
        s.nextLine();
    try{
       
        FileWriter writer=new FileWriter(fname,true);
        System.out.println("Enter the content");
        String content=s.nextLine();
        s.nextLine();
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
    String name=s.next();
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
case 4:{
    System.out.println("Enter file name");
    String finame=s.next();
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
