import java.util.*;


public class ex02{
    public static int sum(int n){
        int sum = 0;
        for( int i=1;i<=n;i++){
            if(i%2==1){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(sum(n));
}
}