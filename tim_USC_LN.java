import java.util.Scanner;

public class tim_USC_LN {
    public static void main(String[] args) {
        int a, b;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = nhap.nextInt();
        System.out.println("Enter b: ");
        b = nhap.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);
        System.out.println(a);
        if (a == 0 || b == 0){
            System.out.println("No greatest common factor");
        } else {
            while (a != b) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }

            System.out.println("Greatest common factor: " + a);
        }
    }
}
