import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class C_Ass2 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        
       while(true){
       
            System.out.println("MENU:\n 1: To add element to list\n 2: To remove elements from the list\n 3: To Display elements from list\n 4: To exit");
            int option=scan.nextInt();
            switch(option){
            case 1:{
System.out.println("Enter no of elements to add to list");
int num=scan.nextInt();
System.out.println("Enter the elements ");
for(int i=0;i<num;i++){
    list.add(scan.nextInt());
   
}
break;
            }
            case 2:{
                System.out.println("Enter the element to remove from list");
                Integer k=scan.nextInt();
                if(list.contains(k)){
                 list.remove(k);
                 System.out.println("Element deleted from list: "+k);
                }
                else{
                    System.out.println("No such element Exist");
                }
                break;
            }
            case 3:{
                System.out.println(list);
                break;
            }
            case 4: System.exit(0);
        }
        }
    }
}
