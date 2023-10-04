import java.util.Scanner;

public class Three {
    public static void main(String[] args){
        Scanner Input=new Scanner(System.in);
        System.out.println("Enter a Frist Number");
        int N1 =Input.nextInt();
        System.out.println("Enter a Second Number");
        int N2 =Input.nextInt();
        System.out.println("Enter a third Number");
        int N3 =Input.nextInt();
        if (N1>N2)
        {
            System.out.println("N1 is lwrgest");
        }
        else if (N2>N3)
        {
            System.out.println("N2 is largest");
        }
        else if (N1>N3)
        {
            System.out.println("N1 is largst");
        } else
        {
            System.out.println("N3 is largest");
        }
    }
}
