import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C_Ass1_set {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<Integer>();
        System.out.println("Enter no of elements to enter");
        int num=scan.nextInt();
        System.out.println("Enter the elemets");
        for(int i=0;i<num;i++){
            set.add(scan.nextInt());
        }
             System.out.println( "The final set is "+set);
    }
}
