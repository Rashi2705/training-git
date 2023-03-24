import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class C_Ass_queue {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        Queue<Integer> que=new LinkedList<>();
        System.out.println("Enter no of elements in queue");
        int num= scan.nextInt();
        System.out.println("Enter the elements of queue");
        for(int i=0;i<num;i++){
            que.add(scan.nextInt());
        }
        System.out.println("Enter the elements to reverse");
    int value=scan.nextInt();
    int k=num-value;
    Stack<Integer> stack=new Stack<>();
    for(int i=0;i<num;i++){
        stack.push(que.poll());
    }
    while(!stack.isEmpty())
    que.add(stack.pop());
    for(int i=0;i<k;i++){
        int p=que.poll();
        que.add(p);
    }
    System.out.println(que);
    }
}
