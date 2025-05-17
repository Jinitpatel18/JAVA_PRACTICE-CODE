import java.util.*;
public class ex07{
    public static void fibonaci(int n){
        int num1 = 0;
        int num2 = 1;
        for(int i=0;i<=n;i++){
            int fibo = num1 + num2;
            System.out.println(fibo);
            num2 = num1;
            num1 = fibo;
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        fibonaci(n);
    }
}