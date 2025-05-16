
import java.util.*;

public class ex03 {

    public static void greatest(int a, int b) {
        if (a > b) {
            System.out.print("Greater number is :"+a);
        }else{
            System.out.print("Greater number is :"+b);
    }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    greatest(a, b);
    }

}
