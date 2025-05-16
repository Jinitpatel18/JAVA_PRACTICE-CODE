import java.util.*;

public class ex06{
    public static void power(int x, int n){
        double c =  Math.pow(x, n);
        System.out.print(c);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

power(x,n);

    }
}