import java.util.*;

public class ex05{
    public static void age(int n){
        if(n>18){
            System.out.print("Your are Eligible for voting");
        }
        else{
            System.out.print("You are not Eligible for voting");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        age(n);
    }
}
