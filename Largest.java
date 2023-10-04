import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner Input =new Scanner (System.in);
        System.out.println("Enter a Number");
        int N1 = Input.nextInt();
        System.out.println("Enter a Another Number");
        int N2 =Input.nextInt();
        if(N1>N2){
            System.out.println("N1 is largest");
        }
        else
        System.out.println("N2 is largest");
    }
}
