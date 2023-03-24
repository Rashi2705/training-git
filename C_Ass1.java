import java.util.ArrayList;
import java.util.Scanner;

public class C_Ass1 {
    public static void main(String[]args){
        ArrayList<Integer> list=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no of elements in list");
        int num=scan.nextInt();
        System.out.println("Enter the elements of list");
        for(int i=0;i<num;i++){
            int value=scan.nextInt();
            if(!list.contains(value))
            list.add(value);
        }
        System.out.println(list);
    }
}
