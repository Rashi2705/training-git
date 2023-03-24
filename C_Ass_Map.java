import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class C_Ass_Map {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        HashMap<Integer,Integer> mapInt=new HashMap<>();
        HashMap<Character,Integer> mapChar=new HashMap<>();
        System.out.println("Enter the String");
        String str=scan.nextLine();
        System.out.println("Enter the no of elements to enter to list");
        int num=scan.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<num;i++){
            int value=scan.nextInt();
            if(!mapInt.containsKey(value)){
                mapInt.put(value,1);
            }
            else
            mapInt.put(value,mapInt.get(value)+1);
        }
        System.out.println(mapInt.entrySet());
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                Character c=str.charAt(i);
                if(!mapChar.containsKey(c)){
                    mapChar.put(c,1);
                }
                else
                mapChar.put(c,mapChar.get(c)+1);
            }
            }
            System.out.println(mapChar.entrySet());
        }
    }

