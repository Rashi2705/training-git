public class Assignment1 {
    public static void main(String[]args){
                int[]arr={89,98,76,56,34,101};
                int S_highest=Integer.MIN_VALUE,highest=arr[0];
                
                for(int i=1;i<arr.length;i++){
                    if(arr[i]>highest){
                        S_highest=highest;
                        highest=arr[i];
                    }
                    else{
                        if(arr[i]<highest&&arr[i]>S_highest)
                            S_highest=arr[i];
                    }
                }
                System.out.println(highest+" "+S_highest);
            }
}
