import java.util.InputMismatchException;
import java.util.Scanner;
class AgeNotValidException extends Exception{
    public String toString(){
        return "Age is not valid it must be above 18 years";
    }
}
public class CustomException {
    public static void main(String[]args){
        Scanner Scan=new Scanner(System.in);
        System.out.println("Enter Your age");
        try{
            int age=Scan.nextInt();
            if(age<18){
                throw new AgeNotValidException();
            }
            else{
                System.out.println("Age is Valid");
            }

        }catch(AgeNotValidException e){
            System.out.println(e);
        }
        catch(InputMismatchException e){
            System.out.println("Age Must be a number");
        }
    }
}
