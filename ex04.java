import java.util.*;

public class ex04{
    public static void circumference(int r){
        double c = 2 * Math.PI * r;
        System.out.print(c);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r= sc.nextInt();

        circumference(r);
    }
}