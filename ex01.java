import java.util.*;

public class ex01{
    public static int avg(int a, int b,int c){
        return ((a+b+c)/3);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print("Avrage of three number : "+avg(a,b,c));
    }
}