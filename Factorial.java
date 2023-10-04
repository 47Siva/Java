import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner Input =new Scanner(System.in);
        System.out.println("Enter a number");
        int Num = Input.nextInt();
        int sum= 1;
        for(int i=1;i<=Num;i++){
            sum*=i;
            System.out.println(sum);
        }
    }
}
