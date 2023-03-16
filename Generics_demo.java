import java.util.ArrayList;
import java.util.Scanner;

class Generics_demo{
    public static void main(String[]args){
        ArrayList<String> list=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter top 5 students name");
        for(int i=0;i<5;i++){
            String name=scan.nextLine();
            list.add(name);
        }
        System.out.println("Top 2 students are "+ list.get(0)+" and "+list.get(1));
    }
}