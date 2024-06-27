import java.util.TreeSet;
import java.util.Scanner;
class TreeSet1{
    public static void main(String[]args){
        TreeSet<String> ts1=new TreeSet<>();
        Scanner ts=new Scanner(System.in);

        int n=5;
        System.out.println("enter the values:");

        for(int i=0;i<n;i++){
          ts1.add(ts.nextLine());
            System.out.println(ts1);
        }
    }}