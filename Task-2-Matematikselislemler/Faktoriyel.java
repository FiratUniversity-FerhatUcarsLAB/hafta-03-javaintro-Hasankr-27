import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyel Sayısı : ");
        int a = input.nextInt();
        int result = 1 ;

        for (int i = 1; i<=a; i++){
            result = result * i ;
        }
        System.out.println("Sonuç 5! : " + result );
    }
}
